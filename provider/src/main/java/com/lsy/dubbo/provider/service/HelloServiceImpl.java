package com.lsy.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author lsy
 * @version 1.0
 * @date 2021/2/19 17:59
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        
        return "hello@@" + name;
    }
}
