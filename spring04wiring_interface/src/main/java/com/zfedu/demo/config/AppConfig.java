package com.zfedu.demo.config;

import com.zfedu.demo.dao.UserDao;
import com.zfedu.demo.service.UserService;
import com.zfedu.demo.service.com.zfedu.demo.service.impl.UserServiceNormal;
import com.zfedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//下面三行是组件扫描的基础包的三种配置方法，以第三种最好，重构时不会带来麻烦
//@ComponentScan("com.zfedu.demo")
//@ComponentScan(basePackages ={"com.zfedu.demo.dao","com.zfedu.demo.service","com.zfedu.demo.web"})
@ComponentScan(basePackageClasses = {UserDao.class, UserServiceNormal.class, UserController.class})
public class AppConfig {

}
