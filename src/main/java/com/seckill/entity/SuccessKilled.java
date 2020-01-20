package com.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Stephen Jia
 * @create 2020-01-13   23:00
 */
@Data
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private short state;
    private Date createTime;

    //一条Seckill商品实体对应多个successKilled记录，所以是一对多关系，在这里把这个关系体现出来，加一个对应的秒杀记录的属性
    private Seckill seckill;
}
