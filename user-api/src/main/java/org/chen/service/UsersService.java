package org.chen.service;

import org.chen.pojo.Users;

import java.util.List;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 10:59
 */
public interface UsersService {

    void save(Users users);

    void update(Users users);

    void delete(int id);

    Users findById(int id);

    List<Users> find();

}
