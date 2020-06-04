package com.lix.transfer.client;

import com.lix.transfer.domain.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("getUsers")
    public List<User> getUsers();
}
