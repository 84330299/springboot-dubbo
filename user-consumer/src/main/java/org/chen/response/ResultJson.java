package org.chen.response;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 14:50
 */
public class ResultJson<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "消息")
    private String msg;
    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "数据")
    private T t;

    public String getMsg() {
        return msg;
    }

    public ResultJson setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public ResultJson setCode(Integer code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return t;
    }

    public ResultJson setData(T t) {
        this.t = t;
        return this;
    }

}
