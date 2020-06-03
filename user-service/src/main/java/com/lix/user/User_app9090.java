package com.lix.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:14
 **/

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class User_app9090 {
    public static void main(String[] args) {
        SpringApplication.run(User_app9090.class, args);
    }

}
