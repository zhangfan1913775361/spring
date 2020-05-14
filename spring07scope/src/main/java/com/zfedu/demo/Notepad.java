package com.zfedu.demo;

/**
 * Created by zhangfan 2020/5/12
 */
public class Notepad {
    public Notepad() {
        super();
        System.out.println("Notepad的构造函数。。。。。"+this.toString());
    }
    public void init(){
        System.out.println("Notepad调用初始化方法。。。。");
    }
    public void destory(){
        System.out.println("调用销毁方法。。。。。");
    }
}
