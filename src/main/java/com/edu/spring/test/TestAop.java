package com.edu.spring.test;

import com.edu.spring.aopnno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopnno(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }
}
