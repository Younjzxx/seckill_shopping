package com.seckill.dto;

import lombok.Data;

/**暴露秒杀地址dto
 * dto：数据传输层
 * @author Stephen Jia
 * @create 2020-01-14   15:48
 */
@Data
public class Exposer {
    //是否开启秒杀
    private boolean exposed;
    //一种加密措施
    private String md5;
    //id
    private long seckillId;

    //系统当前时间(毫秒)
    private long now;
    //开启时间
    private long start;
    //结束时间
    private long end;

    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId = seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
        //exposer=Exposer(exposed=false, md5=null, seckillId=1000, now=1579071134117, start=1576080000000, end=1576166400000)
    }

    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }
}
