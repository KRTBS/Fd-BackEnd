package com.service;

import com.pojo.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<Users> queryAllUser();

    Users queryUserByName(String name);

    Users queryUserByID(int userID);

    //??
    Users quertUserRoleByName(String name);

    //更新信息
    int updataInfo(Users users);

    //更新密码
    int updataPwd(Users users);

    //注册新普通用户
    int userRegist(Users users);

}
