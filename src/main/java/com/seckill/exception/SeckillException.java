package com.seckill.exception;

/**秒杀相关业务异常
 * @author Stephen Jia
 * @create 2020-01-14   16:04
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
