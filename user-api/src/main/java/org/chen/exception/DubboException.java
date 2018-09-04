package org.chen.exception;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 11:01
 */
public class DubboException extends RuntimeException {

    public DubboException() {
        super();
    }

    public DubboException(String message) {
        super(message);
    }

    public DubboException(String message, Throwable cause) {
        super(message, cause);
    }

    public DubboException(Throwable cause) {
        super(cause);
    }

    protected DubboException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
