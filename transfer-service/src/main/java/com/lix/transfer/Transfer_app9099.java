package com.lix.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-demo
 * @description: 90
 * @author: lixin
 * @create: 2020-06-04 10:01
 **/
@SpringCloudApplication
//@EnableFeignClients

public class Transfer_app9099 {
    public static void main(String[] args) {
        SpringApplication.run(Transfer_app9099.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
