package com.controller;

import com.pojo.ResponseBean;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ExceptionController {

    //Exception e, HttpServletRequest request, HttpServletResponse response

    //@ResponseStatus(HttpStatus.UNAUTHORIZED)
    //@ExceptionHandler(ShiroException.class)
    //public ResponseBean handle401(ShiroException e){
    //    return new ResponseBean(401,e.getMessage(),null);
    //}

    //@ResponseStatus(HttpStatus.UNAUTHORIZED)
    //@ExceptionHandler(UnauthorizedException.class)
    //public ResponseBean handle401(){
    //    return new ResponseBean(401,"UNAUTHORIZED",null);
    //}
    //
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    //@ExceptionHandler(Exception.class)
    //public ResponseBean globalException(HttpServletRequest request, Throwable throwable){
    //    ResponseBean responseBean = new ResponseBean(getStatus(request).value(), throwable.getMessage(), null);
    //    System.out.println("globalException");
    //    return responseBean;
    //}

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(ShiroException.class)
    public ResponseBean handle401(ShiroException e,HttpServletRequest request, HttpServletResponse response){
        return new ResponseBean(401,e.getMessage(),null);
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseBean handle401(Exception e, HttpServletRequest request, HttpServletResponse response){
        return new ResponseBean(401,"UNAUTHORIZED",null);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ResponseBean globalException(Exception e, HttpServletRequest request, HttpServletResponse response, Throwable throwable){
        ResponseBean responseBean = new ResponseBean(getStatus(request).value(), e.getMessage(), null);
        System.out.println("globalException");
        return responseBean;
    }

    private HttpStatus getStatus(HttpServletRequest request){
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
