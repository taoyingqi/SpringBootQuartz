package com.example.demo.util;

/**
 * Created by lonel on 2016/5/3.
 */
@SuppressWarnings(value = {"all"})
public class Result<T> {
    public final static int CALLBACK = 999;
    public final static int OK = 1000;
    public final static int PARAM_ERROR = 1001;//参数错误
    public final static int ERROR = 1004;

    private int code; //错误码
    private String message; // optional消息提示
    private T data; //optional 数据
    private int bizCode; //optional 业务码

    public Result() {
    }

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, int bizCode) {
        this.code = code;
        this.bizCode = bizCode;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code, String message, int bizCode) {
        this.code = code;
        this.message = message;
        this.bizCode = bizCode;
    }

    public Result(int code, String message, T data, int bizCode) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.bizCode = bizCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getBizCode() {
        return bizCode;
    }

    public void setBizCode(int bizCode) {
        this.bizCode = bizCode;
    }

}

