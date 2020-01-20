package com.seckill.exception;

/**秒杀关闭异常
 * @author Stephen Jia
 * @create 2020-01-14   16:02
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
