package com.zfedu.demo.service;

import com.zfedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;//不用spring时，可以用jdk自带的注解，

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

//    @Autowired
//    @Qualifier("normal")
    @Resource(name = "userServiceNormal")//jdk自带的注解，替代上面两行
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
