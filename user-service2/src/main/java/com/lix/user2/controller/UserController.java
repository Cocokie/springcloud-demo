package com.lix.user2.controller;

import com.lix.user2.domain.User;
import com.lix.user2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:14
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getUsers")
    public List<User> getUsers() {
        List<User> users = userService.getUsers();
        User u = new User();
        u.setAge(666);
        u.setUsername("user-service2");
        u.setId(1);
        users.add(u);
        return users;
    }
}
