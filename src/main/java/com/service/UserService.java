package com.service;

import com.pojo.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<Users> queryAllUser();

    Users queryUserByName(String name);

    Users quertUserRoleByName(String name);

}
