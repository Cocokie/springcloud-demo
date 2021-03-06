package com.lix.user.controller;

import com.lix.user.domain.User;
import com.lix.user.service.UserService;
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
    public List<User> getUsers() throws InterruptedException {
        //Thread.sleep(4000);
        List<User> users = userService.getUsers();
        User u = new User();
        u.setAge(999);
        u.setUsername("user-service1");
        u.setId(1);
        users.add(u);
        return users;
    }
}
