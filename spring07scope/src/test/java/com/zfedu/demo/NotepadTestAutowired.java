package com.zfedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangfan 2020/5/12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")//这一行注解，就相当于spring上下文加载了，所以单元测试里什么都不用写
public class NotepadTestAutowired {

    @Test
    public void test01(){

    }
}
