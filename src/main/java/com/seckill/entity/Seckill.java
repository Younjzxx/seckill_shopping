package com.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Stephen Jia
 * @create 2020-01-13   22:55
 */
@Data
public class Seckill {
    private long seckillId;

    private String name;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;
}
