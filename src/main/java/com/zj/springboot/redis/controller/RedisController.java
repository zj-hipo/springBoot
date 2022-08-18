package com.zj.springboot.redis.controller;


import com.sun.javafx.collections.MappingChange;
import com.zj.springboot.redis.entity.UserEntity;
import com.zj.springboot.redis.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @program: springbootdemo
 * @Date: 2019/1/25 15:03
 * @Author: Mr.Zheng
 * @Description:
 */

@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public boolean redisset(@RequestBody String key, @RequestBody String value) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());

        //return redisUtil.set(key,userEntity,ExpireTime);
        return redisUtil.set(key, value);

    }

    @RequestMapping("/get")
    public Object redisget(@RequestBody String key) {

        return redisUtil.get(key);
    }

    @RequestMapping("/expire")
    public boolean expire(String key) {
        return redisUtil.expire(key, ExpireTime);
    }
}