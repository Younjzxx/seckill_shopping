# seckill_shopping
应用Spring5，mybatis，springmvc，mysql完成了秒杀业务的DAO层、service层、web层的建模。  

在web层的设计上实现了Restful风格。  
对并发问题进行了简单的优化：  
  1.应用redis进行了后端的缓存。   
  2.建立了mysql的存储过程，将更新库存的事务逻辑部署在mysql服务端，，避免用户因为受到网络延迟和GC的影响而导致事务锁持有时间过长。
  
  
待优化和不足：可以进一步应用CDN进行页面静态资源的部署，前端页面还需美化，欠缺分布式的设计等。
