package com.feng.cluster.controller;

import com.feng.cluster.configration.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/19 18:53
 * @Version V1.0
 */
@RestController
@ResponseBody
public class RedisTestController {

    @Autowired
    RedisUtil redisUtil;

    @GetMapping(value = "save")
    public void test(){
        redisUtil.set("慕和南道","15栋3单元");
    }
}
