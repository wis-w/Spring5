package com.edu.spring.proxyDemo;

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }
    public String update(String id) {
        System.out.println("service方法执行了");
        return id;
    }
}
