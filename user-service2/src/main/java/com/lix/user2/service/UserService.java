package com.lix.user2.service;

import com.lix.user2.domain.User;
import com.lix.user2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:15
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
