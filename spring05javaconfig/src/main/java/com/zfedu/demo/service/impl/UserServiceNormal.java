package com.zfedu.demo.service.impl;

import com.zfedu.demo.dao.UserDao;
import com.zfedu.demo.service.UserService;

/**
 * Created by ZhangFan 2020/5/10
 */
public class UserServiceNormal implements UserService {

    private UserDao userDao;

    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
