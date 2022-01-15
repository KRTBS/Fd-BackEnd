package com.controller;

import com.pojo.ResponseBean;
import com.pojo.Users;
import com.service.UserService;
import com.util.JwtUtils;
import com.util.MyUtils;
import com.pojo.LoginUserBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class AccountController {

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseBean login(@RequestBody LoginUserBean loginUserBean, HttpServletResponse httpServletResponse){
        Users users = userService.queryUserByName(loginUserBean.getUsername());
        //if (users == null)
        //    return new ResponseBean(HttpStatus.UNAUTHORIZED.value(), "UserName Not Exist",null);
        if (users.getUserPassword().equals(loginUserBean.getPassword())){
            String TOKEN = JwtUtils.getToken(users.getUserName(),users.getUserRole());
            httpServletResponse.setHeader("Authorization",TOKEN);
            httpServletResponse.setHeader("Access-Control-Expose-Headers","Authorization");
            return new ResponseBean(HttpStatus.OK.value(), "Login Success",TOKEN);
        }else
            return new ResponseBean(HttpStatus.UNAUTHORIZED.value(), "Login Error",null);
    }
}
