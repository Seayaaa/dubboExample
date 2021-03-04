package com.lsy.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsy.dubbo.provider.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsy
 * @version 1.0
 * @date 2021/2/22 17:11
 */
@RestController
public class HelloController {
    //此处使用阿里巴巴的注解进行注入
    @Reference
    HelloService helloService;
    
    @RequestMapping("/hello")
    public String hello(String name) {

        String result = helloService.sayHello(name);
        System.out.println(result);
        return result;
    }
}
