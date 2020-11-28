package com.edu.spring;

import com.edu.spring.bean.Emp;
import com.edu.spring.bean.Orders;
import com.edu.spring.collectiontype.Stu;
import com.edu.spring.entity.Order;
import com.edu.spring.entity.User;
import com.edu.spring.service.UserService;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.edu.spring.collectiontype.Book;

/**
 * 主测试类
 */
public class TestSpring {

    private ApplicationContext context1;
    private ApplicationContext context2;
    private ApplicationContext context3;
    private ApplicationContext context4;
    private ApplicationContext context5;

    @Before
    public void before (){
        // 加载Spring的配置文件
        context1 = new ClassPathXmlApplicationContext("classpath:bean1.xml");
        context2 = new ClassPathXmlApplicationContext("classpath:bean2.xml");
        context3 = new ClassPathXmlApplicationContext("classpath:bean3.xml");
        //context4 = new ClassPathXmlApplicationContext("classpath:bean4.xml");
        context5 = new ClassPathXmlApplicationContext("classpath:bean5.xml");
    }

    @Test
    public void addService(){
        ApplicationContext context7 = new ClassPathXmlApplicationContext("classpath:bean7.xml");
        UserService userService = context7.getBean("userService", UserService.class);
        userService.add3();
    }

    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean7.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add2();
    }

    @Test
    public void empAutoWire(){
        System.out.println(context5.getBean("emp", com.edu.spring.autowire.Emp.class).toString());
    }

    @Test
    public void testOrder(){
        Orders orders = context4.getBean("orders", Orders.class);
        System.out.println(orders.toString());
        System.out.println("第四步,获取创建的对象");
    }

    @Test
    public void testBook2(){
        Book book1 = context3.getBean("book", Book.class);
        Book book2 = context3.getBean("book", Book.class);
        System.out.println(book1==book2);
    }

    @Test
    public void testStu(){
        Stu stu = (Stu) context3.getBean("stu");
        System.out.println(stu.toString());
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
