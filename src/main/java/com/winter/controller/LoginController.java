package com.winter.controller;

import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * @Author: songyalong
     * @Description:
     * @param username 用户名
     * @param password 密码
     * @Date: Created in 17:40 2018/2/28
     */
    @RequestMapping(value = "/login/")
    public String login(String username, String password){

        return "登陆成功";
    }
}
