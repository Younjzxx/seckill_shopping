package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Stephen Jia
 * @create 2020-01-14   11:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() {
        long id = 1001;
        long phone = 13888888888L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount = " + insertCount);
        //第一次insertCount = 1
        //第二次insertCount = 0 这样的原因是因为
        //  1.联合主键必须唯一重复的时候不允许插入 PRIMARY KEY (seckill_id, user_phone)
        //  2.因为有ignore的sql关键字所以sql语句并不会报错，而是返回0

    }

    @Test
    public void queryByIdWithSeckill() {
        long id = 1001;
        long phone = 13888888888L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
//        SuccessKilled(seckillId=1001,
//        userPhone=13888888888,
//        state=0,
//        createTime=Tue Jan 14 12:09:02 CST 2020,
//        seckill=Seckill(seckillId=1001, name=50元秒杀电动自行车, number=200, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020))
//                Seckill(seckillId=1001, name=50元秒杀电动自行车, number=200, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020)
//

    }
}