package com.zfedu.demo.service.com.zfedu.demo.service.impl;

import com.zfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangFan on 2020/5/9.
 */
@Component
@Qualifier("festival")
public class UserServiceFestival implements UserService {

    public void add() {
        System.out.println("注册的用户会发送优惠券");

    }
}
