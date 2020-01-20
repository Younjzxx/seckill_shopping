package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

/**配置spring和junit整合，junit启动时自动加载springIOC容器
 * spring-test,junit
 * @author Stephen Jia
 * @create 2020-01-14   10:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit，spring配置文件的位置
@ContextConfiguration({"classpath:spring-dao.xml"})
public class SeckillDaoTest {
    //注入dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() throws Exception{
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);

//         100元秒杀GTX1080Ti高性能游戏显卡
//         Seckill(seckillId=1000, name=100元秒杀GTX1080Ti高性能游戏显卡, number=100, startTime=Thu Dec 12 00:00:00 CST 2019,
//         endTime=Fri Dec 13 00:00:00 CST 2019,
//         createTime=Mon Jan 13 22:36:52 CST 2020)

    }

    @Test
    public void queryAll() throws Exception{
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill :
                seckills) {
            System.out.println(seckill);
        }
//        Seckill(seckillId=1000, name=100元秒杀GTX1080Ti高性能游戏显卡, number=100, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020)
//        Seckill(seckillId=1001, name=50元秒杀电动自行车, number=200, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020)
//        Seckill(seckillId=1002, name=10元秒杀Air Jordan1篮球鞋, number=300, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020)
//        Seckill(seckillId=1003, name=500元秒杀欧洲六国豪华双人游, number=400, startTime=Thu Dec 12 00:00:00 CST 2019, endTime=Fri Dec 13 00:00:00 CST 2019, createTime=Mon Jan 13 22:36:52 CST 2020)
    }

    @Test
    public void reduceNumber() throws Exception{
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L, killTime);
        System.out.println("updateCount = " + updateCount);
        //updateCount = 0
    }
}