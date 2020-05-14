package com.zfedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangfan 2020/5/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTest2 {

    @Autowired
    private Notepad2 notepad1;

    @Autowired
    private Notepad2 notepad2;

    @Test
    public void test01(){
//        System.out.println(notepad1 == notepad2);

    }
}
