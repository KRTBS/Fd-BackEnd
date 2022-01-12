package com.exception;


import com.pojo.ResponseBean;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //@ResponseStatus(HttpStatus.UNAUTHORIZED)
    //@ExceptionHandler(Exception.class)
    //public ResponseBean globalException(Exception e, HttpServletRequest request, HttpServletResponse response) {
    //    ResponseBean responseBean = new ResponseBean(401, "Error", null);
    //    return responseBean;
    //}
}
