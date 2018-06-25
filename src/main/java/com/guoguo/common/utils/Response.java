package com.guoguo.common.utils;

/**
 * 创建者:刘达
 * 创建日期: 2018/4/11
 * 创建时间: 13:20
 */
public class Response<T> {
    public static final Integer OK = Integer.valueOf(1);
    public static final Integer Fail = Integer.valueOf(-1);
    private Integer code;
    private String message;
    private T result;

    public Response() {
    }

    public static Response ok(String message) {
        Response response = new Response();
        response.setCode(OK);
        response.setMessage(message);
        return response;
    }

    public static Response failed(String message) {
        Response response = new Response();
        response.setCode(Fail);
        response.setMessage(message);
        return response;
    }

    public static Response from(Integer code, String message) {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> from(Integer code, String message, T result) {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
