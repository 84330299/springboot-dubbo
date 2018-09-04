package org.chen.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users implements Serializable {

    @ApiModelProperty(value = "用户编号")
    private int uid;
    @ApiModelProperty(value = "用户名")
    private String uname;
    @ApiModelProperty(value = "用户年龄")
    private int uage;
    @ApiModelProperty(value = "用户性别")
    private String usex;

}
