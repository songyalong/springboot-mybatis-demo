package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@Api("swaggerDemoController相关的api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    public int insertUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/test2")
    public Object test(){
        Map<String, String> data = new HashMap<>();
        data.put("dd", "dd");
        return data;
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=utf-8"})
    public Object findUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum, pageSize);
    }



}
