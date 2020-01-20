package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Stephen Jia
 * @create 2020-01-13   23:06
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId 秒杀id
     * @param killTime 对应数据库中的createTime
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据seckillId查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * 形参为多个基本参数的时候：形参前使用@param注解目的是告知mybatis：sql语句中的字段对应的传入形参的值
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 使用存储过程完成秒杀
     * @param paramMap
     */
    void killByProcedure(Map<String, Object> paramMap);


}
