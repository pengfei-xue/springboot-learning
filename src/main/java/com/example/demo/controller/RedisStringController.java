package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisStringController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping(value="/redis/setget.html")
    public @ResponseBody String env(String para) throws Exception {
        redisTemplate.opsForValue().set("setenv", para);
        String str = redisTemplate.opsForValue().get("setenv");
        return str;
    }
}
