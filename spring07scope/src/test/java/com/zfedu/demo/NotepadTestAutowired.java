package com.zfedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangfan 2020/5/12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")//这一行注解，就相当于spring上下文加载了，所以单元测试里什么都不用写
public class NotepadTestAutowired {

    @Autowired
    private Notepad notepad1;

    @Autowired
    private Notepad notepad2;

    @Test
    public void test01(){
//        Notepad notepad1 = (Notepad)context.getBean("notepad");
//        Notepad notepad2 = (Notepad)context.getBean("notepad");
        System.out.println(notepad1 == notepad2);//无论注入多少次，你最终获取的都是同一个，所以为true；

    }
}
