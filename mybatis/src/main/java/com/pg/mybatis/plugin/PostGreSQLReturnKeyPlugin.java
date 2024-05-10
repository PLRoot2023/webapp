package com.pg.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class PostGreSQLReturnKeyPlugin  extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }


    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        XmlElement selectKey = addSelectKey(introspectedTable);
        element.addElement(0, selectKey);
        return super.sqlMapInsertElementGenerated(element, introspectedTable);
    }

    /**
     * 新增SqlMapper.xml里面PostGreSql返回主键基础的insertSelective方法
     * @param element
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        XmlElement selectKey = addSelectKey(introspectedTable);
        element.addElement(0, selectKey);
        return super.sqlMapInsertSelectiveElementGenerated(element, introspectedTable);
    }

    private XmlElement addSelectKey(IntrospectedTable introspectedTable){
        String resultType = introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType().getFullyQualifiedName();
        String keyProperty = introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName();

        String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
        String sql = "SELECT currval('" + tableName + "_id_seq')";

        XmlElement selectKey = new XmlElement("selectKey");
        TextElement selectKeySQL = new TextElement(sql);
        selectKey.addAttribute(new Attribute("keyProperty",keyProperty));
        selectKey.addAttribute(new Attribute("order","AFTER"));
        selectKey.addAttribute(new Attribute("resultType", resultType));
        selectKey.addElement(selectKeySQL);
        return selectKey;
    }

}
