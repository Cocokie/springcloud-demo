package com.lix.user2.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: springcloud-demo
 * @description:
 * @author: lixin
 * @create: 2020-06-03 16:15
 **/
@Data
@Table(name = "user")
public class User {
    @Id
    Integer id;
    @Column(name = "username")
    String username;
    @Column(name = "age")
    Integer age;
}
