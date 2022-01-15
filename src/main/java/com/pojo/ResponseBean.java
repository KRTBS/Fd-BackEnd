package com.pojo;

import org.springframework.http.HttpStatus;

public class ResponseBean {

    //status code
    private int code;

    //msg
    private String msg;

    //information
    private Object data;

    public ResponseBean() {
    }

    public ResponseBean(Object data) {
        this.data = data;
    }

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseBean OK(){
        this.code = HttpStatus.OK.value();
        this.msg = HttpStatus.OK.getReasonPhrase();
        return this;
    }

    public ResponseBean CREATED(){
        this.code = HttpStatus.CREATED.value();
        this.msg = HttpStatus.CREATED.getReasonPhrase();
        return this;
    }

    public ResponseBean NOT_FOUND(){
        this.code = HttpStatus.NOT_FOUND.value();
        this.msg = HttpStatus.NOT_FOUND.getReasonPhrase();
        return this;
    }

    public ResponseBean BAD_REQUEST(){
        this.code = HttpStatus.BAD_REQUEST.value();
        this.msg = HttpStatus.BAD_REQUEST.getReasonPhrase();
        return this;
    }
}
