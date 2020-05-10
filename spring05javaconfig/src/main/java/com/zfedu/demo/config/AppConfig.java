package com.zfedu.demo.config;

import com.zfedu.demo.dao.UserDao;
import com.zfedu.demo.dao.impl.UserDaoNormal;
import com.zfedu.demo.service.UserService;
import com.zfedu.demo.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZhangFan 2020/5/10
 */
@Configuration
public class AppConfig {
    @Bean
    public UserDao userDaoNormal(){
        System.out.println("创建UserDao对象的被@bean注解自动调用了");
        return new UserDaoNormal();
    }

    @Bean
    public UserServiceNormal userServiceNormal(UserDao userDao){
        System.out.println("创建UserService对象bean自动调用");
//        UserDao userDao = userDaoNormal();
        UserServiceNormal userServiceNormal = new UserServiceNormal();
        userServiceNormal.setUserDao(userDao);
        return userServiceNormal;

    }
}
