package com.zfedu.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangfan 2020/5/12
 */
public class NotepadTest {
    /**
     * (1)无论是否主动获取bean对象，spring的上下文已加载就创建对象。（不写getbean照样有）
     * (2)无论你注入几次，获得的都是通一个对象。
     */

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Notepad notepad1 = (Notepad)context.getBean("notepad");
        Notepad notepad2 = (Notepad)context.getBean("notepad");
        System.out.println(notepad1 == notepad2);//如果只是两个
    }
}
