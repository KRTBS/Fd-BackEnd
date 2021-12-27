package com.dao;

import com.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询所有用户
    List<Users> queryAllUser();

    //根据用户名查询用户
    Users queryUserByName(String name);

    Users quertUserRoleByName(String name);
}
