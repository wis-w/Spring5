package com.edu.spring.service;

import com.edu.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// <bean id = "userService" class="..."> 效果相同 value属性值可以省略，默认值是类名称，首字母小写
@Service
public class UserService {

    // 创建UserDao类型的方法
    @Autowired
    private UserDao dao ;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void add3(){
        dao.add();
    }

    @Test
    public void add(){
        System.out.println("service add..........");
        dao.update();
    }

    public void add2(){
        System.out.println("service.add2....");
    }




}
