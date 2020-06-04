package com.lix.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:14
 **/


@SpringCloudApplication
@MapperScan("com.lix.user.mapper")
public class User_app9090 {
    public static void main(String[] args) {
        SpringApplication.run(User_app9090.class, args);
    }

}
