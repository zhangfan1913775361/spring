package com.zfedu.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zhangfan 2020/5/12
 */
@Component
//@Scope("prototype")
//@Scope(scopeName = "prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//以上三种都可以
public class Notepad2 {
    public Notepad2() {
        super();
        System.out.println("Notepad的构造函数。。。。。"+this.toString());
    }
}
