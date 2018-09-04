package org.chen.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 11:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DubboExceptionDto<T> {

    private String msg;
    private int code;
    private T result;

}
