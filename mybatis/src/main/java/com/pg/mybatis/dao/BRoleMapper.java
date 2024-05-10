package com.pg.mybatis.dao;

import com.pg.mybatis.entity.BRole;
import com.pg.mybatis.entity.BRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BRoleMapper {
    long countByExample(BRoleExample example);

    int deleteByExample(BRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BRole row);

    int insertSelective(BRole row);

    List<BRole> selectByExampleWithRowbounds(BRoleExample example, RowBounds rowBounds);

    List<BRole> selectByExample(BRoleExample example);

    BRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BRole row, @Param("example") BRoleExample example);

    int updateByExample(@Param("row") BRole row, @Param("example") BRoleExample example);

    int updateByPrimaryKeySelective(BRole row);

    int updateByPrimaryKey(BRole row);
}