package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Api("swaggerDemoController相关的api")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int insertUser(User user){
        return userService.addUser(user);
    }


    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=utf-8"}, method = RequestMethod.POST)
    public Object findUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum, pageSize);
    }



}
