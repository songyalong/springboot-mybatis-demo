package com.winter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/redistest/")
    public String redisHander(){
        stringRedisTemplate.opsForValue().set("redis", "test");
        return stringRedisTemplate.opsForValue().get("redis");
    }
}
