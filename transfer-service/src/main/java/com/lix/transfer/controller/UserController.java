package com.lix.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-04 10:02
 **/
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

//    @Autowired
//    UserClient userClient;

    @GetMapping("getusers")
//    @HystrixCommand(fallbackMethod = "sd",
//            commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//    })
   // @HystrixCommand(fallbackMethod = "sd")
//    @HystrixCommand(fallbackMethod = "sd",
//            commandProperties = {
//                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
//                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
//                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
//            })
    public String getUsers() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://user-service/getUsers", String.class);
        // List<User> users = userClient.getUsers();

        //return JSON.toJSONString(users);
        return forEntity.getBody();
    }

    public String sd() {

        return "fallbackMethod + sd";
    }
}
