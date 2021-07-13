package com.yanht;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ProviderApplication
 * @Description TODO
 * @Author Thien
 * @Date 2021-07-13 09:01
 * @Version 1.0
 */
@DubboComponentScan
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
