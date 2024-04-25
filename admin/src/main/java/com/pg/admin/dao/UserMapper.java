package com.pg.admin.dao;

import com.pg.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
//    @Select(value = "select * from login_user")
    List<User> findAll();
}
