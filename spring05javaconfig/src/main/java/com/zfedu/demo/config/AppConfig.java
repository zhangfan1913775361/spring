package com.zfedu.demo.config;

import com.zfedu.demo.dao.UserDao;
import com.zfedu.demo.dao.impl.UserDaoCache;
import com.zfedu.demo.dao.impl.UserDaoNormal;
import com.zfedu.demo.service.UserService;
import com.zfedu.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by ZhangFan 2020/5/10
 */
@Configuration
public class AppConfig {
    @Bean
//    @Qualifier("normal")
    public UserDao userDaoNormal(){
        System.out.println("创建UserDaoNormal的bean被查找调用了");
        return new UserDaoNormal();
    }

    @Bean
//    @Primary  //这是首选bean，解决javaconfig装配歧义性的方法之一
//    @Qualifier("cache")
    public UserDao userDaoCache(){
        System.out.println("创建UserDaoCache的bean被查找调用了");
        return new UserDaoCache();
    }
    @Bean
    public UserServiceNormal userServiceNormal(@Qualifier("userDaoNormal") UserDao userDao){
        System.out.println("创建UserService对象bean自动调用");
//        UserDao userDao = userDaoNormal();
        UserServiceNormal userServiceNormal = new UserServiceNormal();
        userServiceNormal.setUserDao(userDao);
        return userServiceNormal;

    }
}
