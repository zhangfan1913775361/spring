package com.zfedu.demo.dao.impl;

import com.zfedu.demo.dao.UserDao;

/**
 * Created by ZhangFan 2020/5/10
 */
public class UserDaoCache implements UserDao {
    public void add() {
        System.out.println("添加用户到Dao缓存中。。。。");
    }
}
