package com.seckill.dto;

import lombok.Data;

/**
 * @author Stephen Jia
 * @create 2020-01-15   20:54
 */
//所有ajax请求返回类型，封装json结果
@Data
public class SeckillResult<T> {
    private boolean success;
    private T data;
    private String error;

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }
}
