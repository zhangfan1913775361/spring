package com.zfedu.demo.service.com.zfedu.demo.service.impl;

import com.zfedu.demo.dao.UserDao;
import com.zfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service//同上，功能完全一致
//@Qualifier("normal")
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;
    public void add() {
        userDao.add();
    }
}
