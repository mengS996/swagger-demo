package com.ms.swagger.controller;

import com.ms.swagger.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：孟老师
 * @date ：Created in 2021/3/22 13:17
 * @description：HelloController
 * @modified By：
 * @version: $
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String Hello(){
        return "Hello";
    }
    //只要我们的接口中，返回值存在实体类，它就会被扫描到swagger中的。
    @PostMapping(value = "/user")
    public User postUser(){
        return new User();
    }
    @ApiOperation("控制类的描述，getUser方法")
    @GetMapping(value = "/getuser")
    public User getUser(@ApiParam("形参描述") String s){
        return new User();
    }
    @ApiOperation("测试类")
    @GetMapping(value = "/getuser1")
    public User getUser(@ApiParam("用户名") String name,@ApiParam("密码") String passw){
        User user=new User();
        user.setName(name);
        user.setPassword(passw);
        return user;
    }
}
