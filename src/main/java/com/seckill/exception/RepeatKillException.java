package com.seckill.exception;

/**重复秒杀异常（运行期异常）
 * @author Stephen Jia
 * @create 2020-01-14   16:00
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
