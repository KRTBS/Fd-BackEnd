package com.controller;

import com.pojo.LoginUserBean;
import com.pojo.ResponseBean;
import com.pojo.Users;
import com.service.UserService;
import com.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    @PostMapping("/open/login")
    @ResponseBody
    public ResponseBean login(@RequestBody LoginUserBean loginUserBean, HttpServletResponse httpServletResponse) {
        Users users = userService.queryUserByName(loginUserBean.getUsername());
        if (users.getUserPassword().equals(loginUserBean.getPassword())) {
            String TOKEN = JwtUtils.getToken(users.getUserName(), users.getUserRole());
            httpServletResponse.setHeader("Authorization", TOKEN);
            httpServletResponse.setHeader("Access-Control-Expose-Headers", "Authorization");
            return new ResponseBean(HttpStatus.OK.value(), users.getUserRole(), TOKEN);
        } else
            return new ResponseBean(HttpStatus.UNAUTHORIZED.value(), "Login Error", null);
    }

    @PostMapping("/open/user/regist")
    @ResponseBody
    public ResponseBean userRegist(@RequestBody Users users, HttpServletResponse httpServletResponse) {
        if (userService.userRegist(users) != 0) {
            String TOKEN = JwtUtils.getToken(users.getUserName(), users.getUserRole());
            httpServletResponse.setHeader("Authorization", TOKEN);
            httpServletResponse.setHeader("Access-Control-Expose-Headers", "Authorization");
            return new ResponseBean(HttpStatus.OK.value(), users.getUserRole(), TOKEN);
        } else {
            return new ResponseBean().BAD_REQUEST();
        }
    }

    @GetMapping("/auth/userinfo")
    @ResponseBody
    public ResponseBean getUserInfo(HttpServletRequest httpServletRequest) {
        Users user = userService.queryUserByName(JwtUtils.getUsername(httpServletRequest.getHeader("Authorization")));

        user.setUserPassword("");

        return new ResponseBean(user).OK();
    }

    @PutMapping("/auth/userinfo")
    @ResponseBody
    public ResponseBean updataUserInfo(@RequestBody Users users) {
        return new ResponseBean(userService.updataInfo(users)).OK();
    }

    @PutMapping("/auth/userinfo/pwd")
    @ResponseBody
    public ResponseBean updataPwd(@RequestBody Users users) {
        return new ResponseBean(userService.updataPwd(users)).OK();
    }

    @GetMapping("/auth/user/{id}")
    @ResponseBody
    public ResponseBean queryUserInfoByID(@PathVariable int id){
        Users users = userService.queryUserByID(id);
        users.setUserPassword("");
        return new ResponseBean(users).OK();
    }



}
