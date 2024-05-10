package com.pg.mybatis.dao;

import com.pg.mybatis.entity.BUser;
import com.pg.mybatis.entity.BUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BUserMapper {
    long countByExample(BUserExample example);

    int deleteByExample(BUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BUser row);

    int insertSelective(BUser row);

    List<BUser> selectByExampleWithRowbounds(BUserExample example, RowBounds rowBounds);

    List<BUser> selectByExample(BUserExample example);

    BUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BUser row, @Param("example") BUserExample example);

    int updateByExample(@Param("row") BUser row, @Param("example") BUserExample example);

    int updateByPrimaryKeySelective(BUser row);

    int updateByPrimaryKey(BUser row);
}