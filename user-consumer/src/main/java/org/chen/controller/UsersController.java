package org.chen.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.chen.pojo.Users;
import org.chen.service.UsersService;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 11:24
 */
@RestController
@RequestMapping("user")
public class UsersController {

    @Reference(version = "1.0.0")
    private UsersService usersService;

    @PostMapping("save")
    public void save(@RequestBody Users users) {
        usersService.save(users);
    }

    @PutMapping("update")
    public void update(@RequestBody Users users) {
        usersService.update(users);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        usersService.delete(id);
    }

    @GetMapping("findById/{id}")
    public Object findById(@PathVariable int id) {
        return usersService.findById(id);
    }

    @GetMapping("find")
    public Object find() {
        return usersService.find();
    }
}
