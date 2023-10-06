package com.hust23se.carrothole.util;

import java.util.HashMap;


/**
 * 用于封装向前端传输的数据
 *
 * @author MYH
 * @date 2023-10-06
 */
public class ResultMap extends HashMap<String, Object> {

    public static ResultMap create() {
        return new ResultMap();
    }

    public ResultMap setSuccessMsg(String successMsg) {
        this.put("successMsg", successMsg);
        return this;
    }

    public ResultMap setErrorMsg(String errorMsg) {
        this.put("errorMsg", errorMsg);
        return this;
    }

    public ResultMap setSuccess() {
        this.put("isSuccess", "1");
        return this;
    }

    public ResultMap setError() {
        this.put("isSuccess", "0");
        return this;
    }

    public ResultMap setKeyValue(String key, Object value) {
        this.put(key, value);
        return this;
    }
}

