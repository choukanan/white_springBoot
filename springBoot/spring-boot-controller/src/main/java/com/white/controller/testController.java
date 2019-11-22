package com.white.controller;

import com.white.common.utils.DateUtil;
import com.white.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 山栀
 * @date 2019/11/21 17:51
 */
@RestController
public class testController {

    @Autowired
    private Environment environment;

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/test")
    public String test(){
        String serverPort = environment.getProperty("server.port");
        System.err.println("environment >>>>>> port:" + serverPort);
        return serverPort;
    }

    @GetMapping("/redis")
    public Object redisTest(){

        redisUtils.set("12", 12315431);
        System.out.println(redisUtils.get("12"));
        return redisUtils.get("12");

    }

    @GetMapping("/date")
    public Object dateTest(){

        int day = DateUtil.getCurrentMonthLastDay();

        return "当月天数:" + day;
    }

}
