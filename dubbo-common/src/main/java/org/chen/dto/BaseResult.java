package org.chen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 12:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseResult<T> implements Serializable {

    private String msg;
    private int code;
    private T data;

}
