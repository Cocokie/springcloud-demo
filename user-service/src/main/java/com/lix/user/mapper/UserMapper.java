package com.lix.user.mapper;

import com.lix.user.domain.User;

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
