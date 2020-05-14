package com.zfedu.demo;

/**
 * Created by zhangfan 2020/5/14
 */
public class PersonFactory {
    /**
     * 静态工厂方法
     */
    public static Person createPerson1(){
        System.out.println("静态工厂方法创建Person。。。。。");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("实例工厂方法创建Person。。。。。");
        return new Person();
    }
}
