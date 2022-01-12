package com.config;

import com.pojo.Users;
import com.service.UserService;
import com.util.JwtUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogManager;

public class JwtRealm extends AuthorizingRealm {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JwtUtils.getUsername(principals.toString());
        Users users = userService.queryUserByName(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRole(users.getUserRole());
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        String username = JwtUtils.getUsername(token);
        if (username == null){
            throw new AuthenticationException("TOKEN INVALID");
        }
        Users users = userService.queryUserByName(username);
        if (users == null){
            throw new AuthenticationException("User didn't existed");
        }
        if (!JwtUtils.verifyToken(token)){
            throw new AuthenticationException("Username or Password Error");
        }
        return new SimpleAuthenticationInfo(token,token,"JwtRealm");
    }
}
