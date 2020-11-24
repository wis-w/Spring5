package com.edu.spring.service;

import com.edu.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {

    // 创建UserDao类型的方法
    private UserDao dao ;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Test
    public void add(){
        System.out.println("service add..........");
        dao.update();

    }




}
