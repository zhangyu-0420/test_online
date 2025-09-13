package com.yourcompany.examsystem.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;

    // 添加时间戳字段以满足APIFox校验
    private long timestamp = System.currentTimeMillis();

    public static Result success(String msg, Object data) {
        Result result = new Result();
        result.code = 200;
        result.msg = msg;
        result.data = data;
        result.timestamp = System.currentTimeMillis();
        return result;
    }

    public static Result success(String msg) {
        return success(msg, null);
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.code = 500;
        result.msg = msg;
        result.data = null;
        result.timestamp = System.currentTimeMillis();
        return result;
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        result.data = null;
        result.timestamp = System.currentTimeMillis();
        return result;
    }
}