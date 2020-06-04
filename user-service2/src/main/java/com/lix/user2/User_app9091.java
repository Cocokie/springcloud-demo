package com.lix.user2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:14
 **/

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@MapperScan("com.lix.user2.mapper")
public class User_app9091 {
    public static void main(String[] args) {
        SpringApplication.run(User_app9091.class, args);
    }

}
