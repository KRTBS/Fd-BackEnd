package com.config;

import com.util.JwtUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class JwtFilter extends BasicHttpAuthenticationFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {
        String token = this.getAuthzHeader(request);
        String pathWithinApplication = this.getPathWithinApplication(request);
        return token != null;
    }

    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        JwtToken token = new JwtToken(this.getAuthzHeader(request));
        this.getSubject(request, response).login(token);
        return true;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if (request instanceof HttpServletRequest) {
            if (((HttpServletRequest) request).getMethod().toUpperCase().equals("OPTIONS")) {
                return true;
            }
        }
        if (isLoginAttempt(request,response)){
            try {
                executeLogin(request,response);
                String[] rolesArray = (String[]) mappedValue;
                if (rolesArray == null || rolesArray.length == 0){
                    return true;
                }
                if (Arrays.asList(rolesArray).contains(JwtUtils.getRole(this.getAuthzHeader(request)))){

                    System.out.println(JwtUtils.getRole(this.getAuthzHeader(request)));

                    return true;
                }else {
                    response401(request,response);
                    return false;
                }
            }catch (Exception e){
                response401(request,response);
            }
        }else {
            response401(request,response);
        }
        return false;
    }

    //@Override
    //protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
    //    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    //    HttpServletResponse httpServletResponse = (HttpServletResponse) response;
    //    httpServletResponse.setHeader("Access-control-Allow-Origin",httpServletRequest.getHeader("Origin"));
    //    httpServletResponse.setHeader("Access-control-Allow-Methods","GET,POST,OPTIONS,PUT,DELETE");
    //    httpServletResponse.setHeader("Access-control-Allow-Headers",httpServletRequest.getHeader("Access-Control-Request-Headers"));
    //    if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())){
    //        httpServletResponse.setStatus(HttpStatus.OK.value());
    //        return false;
    //    }return super.preHandle(request,response);
    //}

    private void response401(ServletRequest servletRequest,ServletResponse servletResponse){
        try{
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.sendRedirect("/401");
        }catch (IOException e){
            logger.error(e.getMessage());
        }
    }
}