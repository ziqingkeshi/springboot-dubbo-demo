package com.yanht;

import com.yanht.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName SpringbootConsumerApplication
 * @Description TODO
 * @Author Thien
 * @Date 2021-07-13 09:35
 * @Version 1.0
 */
@SpringBootApplication
public class SpringbootConsumerApplication {
    @Reference(url = "dubbo://192.168.113.60:20880/com.yanht.service.IHelloService")
    private IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(){
        return args -> System.out.println(helloService.sayHello("Mic"));
    }
}
