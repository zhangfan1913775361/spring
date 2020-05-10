package com.zfedu.demo.web;

import com.zfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by ZhangFan 2020/5/10
 */
//@Component
@Controller//同上，功能完全一致
public class UserController{
    @Autowired
    @Qualifier("userServiceNormal")
    private UserService userService;

    public void add(){
        userService.add();
    }

}
