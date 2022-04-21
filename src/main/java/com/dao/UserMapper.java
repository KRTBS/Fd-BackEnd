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

    Users queryUserByID(int userID);

    //根据用户名查询用户角色
    Users quertUserRoleByName(String name);

    //更新信息
    int updataInfo(Users users);

    //更新密码
    int updataPwd(Users users);

    //注册新用户
    int userRegist(Users users);
}
