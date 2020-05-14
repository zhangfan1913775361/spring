package com.zfedu.demo;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangfan 2020/5/14
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonFactoryTest {

    @Autowired
    private Person person1;

    @Autowired
    private PersonFactory person2;

    @Test
    public void test01(){
//        System.out.println(person1);
        System.out.println(person2.createPerson2());

    }
}
