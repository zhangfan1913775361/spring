package com.zfedu.demo.service.com.zfedu.demo.service.impl;

import com.zfedu.demo.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceNormal implements UserService {

    public void add() {
        System.out.println("添加用户");
    }
}
