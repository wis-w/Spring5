package com.edu.spring;

import com.edu.spring.bean.Emp;
import com.edu.spring.entity.Order;
import com.edu.spring.entity.User;
import com.edu.spring.service.UserService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.edu.spring.entity.Book;

/**
 * 主测试类
 */
public class TestSpring {

    private ApplicationContext context1;
    private ApplicationContext context2;

    @Before
    public void before (){
        // 加载Spring的配置文件
        context1 = new ClassPathXmlApplicationContext("classpath:bean1.xml");
        context2 = new ClassPathXmlApplicationContext("classpath:bean2.xml");
    }

    @Test
    public void testDept(){
        Emp emp = context2.getBean("emp", Emp.class);
        System.out.println(emp.toString());
        emp = context2.getBean("emp2", Emp.class);
        System.out.println(emp);
        emp = context2.getBean("emp3", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testDao(){
        UserService userService = context2.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testOeder(){
        Order order = context1.getBean("order", Order.class);
        System.out.println(order.toString());
    }

    @Test
    public void testAdd(){
        // 获取配置创建的对象
        User user = context1.getBean("user",User.class);
        // 调用对象的方法
        user.add();

    }

    @Test
    public void testBook(){
        Book book = context1.getBean("book",Book.class);
        System.out.println(book.toString());
    }
}
