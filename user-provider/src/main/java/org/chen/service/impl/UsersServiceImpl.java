package org.chen.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.chen.pojo.Users;
import org.chen.service.UsersService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 11:20
 */
@Service(version = "1.0.0")
public class UsersServiceImpl implements UsersService {

    private static List<Users> ulist = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            Users u = new Users(i, "学生:" + i, 20 + i, i % 2 > 0 ? "男" : "女");
            ulist.add(u);
        }
    }

    @Override
    public void save(Users users) {
        System.err.println("Users - save");
    }

    @Override
    public void update(Users users) {
        System.err.println("Users - update");
    }

    @Override
    public void delete(int id) {
        System.err.println("Users - delete");
    }

    @Override
    public Users findById(int id) {
        System.err.println("Users - findById");
        return ulist.get(id - 1);
    }

    @Override
    public List<Users> find() {
        System.err.println("Users - find");
        return ulist;
    }
}
