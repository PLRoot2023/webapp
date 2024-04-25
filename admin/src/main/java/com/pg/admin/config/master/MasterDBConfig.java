package com.pg.admin.config.master;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


//@Configuration
//@MapperScan(basePackages = MasterDBConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDBConfig {

    static final String PACKAGE = "cn.db.dao.master";
    static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";


    @Autowired
    @Qualifier("master")
    private DataSource masterDataSource;

    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean masterBean = new SqlSessionFactoryBean();
        masterBean.setDataSource(masterDataSource);
        masterBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        return masterBean.getObject();
    }

}
