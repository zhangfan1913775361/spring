package com.zfedu.demo.dao.impl;

import com.zfedu.demo.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by ZhangFan 2020/5/10
 */
//@Component
@Repository//dao层的组件注解，和component功能完全一致
public class UserDaoNormal implements UserDao {
    public void add() {
        System.out.println("添加用户到数据库中。。。。。");
    }
}
