package com.zfedu.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhangfan 2020/5/12   自动装配的案例
 */
@Component
//@Scope("prototype")
//@Scope(scopeName = "prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//以上三种都可以
@Lazy
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("Notepad2的构造函数。。。。。"+this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Notepad调用初始化方法。。。。");
    }
    @PreDestroy
    public void destory(){
        System.out.println("调用销毁方法。。。。。");
    }
}
