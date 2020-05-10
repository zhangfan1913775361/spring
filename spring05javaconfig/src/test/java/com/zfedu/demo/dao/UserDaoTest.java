package com.zfedu.demo.dao;

import com.zfedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhangFan 2020/5/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserDaoTest {

    @Autowired
    @Qualifier("userDaoNormal")
    private UserDao userDao;

    @Test
    public void testAdd(){
        userDao.add();
    }
}
