package org.chen.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.chen.pojo.Users;
import org.chen.response.ResultJson;
import org.chen.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 11:24
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户管理")
public class UsersController {

    @Reference(version = "1.0.0")
    private UsersService usersService;

    private ResultJson resultJson = new ResultJson();

    @ApiOperation(value = "保存")
    @PostMapping("save")
    public void save(@RequestBody Users users) {
        usersService.save(users);
    }

    @ApiOperation(value = "更新")
    @PutMapping("update")
    public void update(@RequestBody Users users) {
        usersService.update(users);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        usersService.delete(id);
    }

    @ApiOperation(value = "查询根据id")
    @GetMapping("findById/{id}")
    public ResultJson<Users> findById(@PathVariable int id) {
        return resultJson.setCode(200).setMsg("success").setData(usersService.findById(id));
    }

    @ApiOperation(value = "查询")
    @GetMapping("find")
    public ResultJson<List<Users>> find() {
        return resultJson.setCode(200).setMsg("success").setData(usersService.find());
    }
}
