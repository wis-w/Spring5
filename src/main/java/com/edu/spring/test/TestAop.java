package com.edu.spring.test;

import com.edu.spring.aopnno.User;
import com.edu.spring.aopxml.Book;
import com.edu.spring.config.ConfigAop;
import com.edu.spring.config.SpringConfig;
import com.edu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void addService2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test
    public void testAopnno(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop2.xml");
        Book book = applicationContext.getBean("book", Book.class);
        book.buy();
    }
}
