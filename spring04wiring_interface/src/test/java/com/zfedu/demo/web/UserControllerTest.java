package com.zfedu.demo.web;

import com.zfedu.demo.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhangFan 2020/5/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    public void testAdd(){
        userController.add();
    }
}
