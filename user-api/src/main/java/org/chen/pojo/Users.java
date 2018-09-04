package org.chen.pojo;

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

    private int uid;
    private String uname;
    private int uage;
    private String usex;

}
