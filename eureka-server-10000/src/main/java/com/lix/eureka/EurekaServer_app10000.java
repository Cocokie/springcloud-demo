package com.lix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-demo
 * @description: eureka注册中心
 * @author: lixin
 * @create: 2020-06-03 15:34
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_app10000 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_app10000.class, args);
    }
}
