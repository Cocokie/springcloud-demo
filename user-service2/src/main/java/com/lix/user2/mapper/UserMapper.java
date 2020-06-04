package com.lix.user2.mapper;

import com.lix.user2.domain.User;

import java.util.List;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:15
 **/
public interface UserMapper {
    List<User> getUsers();
}
