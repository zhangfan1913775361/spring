package com.zfedu.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhangfan 2020/5/12   javaConfig案例
 */
public class Notepad3 {
    public Notepad3() {
        super();
        System.out.println("Notepad3的构造函数。。。。。"+this.toString());
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
