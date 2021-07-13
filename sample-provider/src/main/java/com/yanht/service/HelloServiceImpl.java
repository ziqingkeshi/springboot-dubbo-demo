package com.yanht.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO
 * @Author Thien
 * @Date 2021-07-12 17:26
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements IHelloService{

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello,%s", serviceName, name);
    }
}
