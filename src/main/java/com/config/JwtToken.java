package com.config;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String TOKEN;

    public JwtToken(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    @Override
    public Object getPrincipal() {
        return TOKEN;
    }

    @Override
    public Object getCredentials() {
        return TOKEN;
    }
}
