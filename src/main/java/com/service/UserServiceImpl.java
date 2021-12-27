package com.service;

import com.dao.UserMapper;
import com.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<Users> queryAllUser() {
        List<Users> list = userMapper.queryAllUser();
        return list;
    }

    @Override
    public Users queryUserByName(@Param("name") String name) {
        Users users = userMapper.queryUserByName(name);
        return users;
    }

    @Override
    public Users quertUserRoleByName(String name) {
        Users users = userMapper.quertUserRoleByName(name);
        return users;
    }
}
