package com.winter.controller;

import com.winter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = "/redistest/")
    public Object redisHander(){
        ValueOperations<String, User> opsForValue = redisTemplate.opsForValue();
        User user = new User();
        user.setUserName("songyalong");
        opsForValue.set("songyalong", user, 100, TimeUnit.SECONDS);
        return redisTemplate.opsForValue().get("song");
    }
}
