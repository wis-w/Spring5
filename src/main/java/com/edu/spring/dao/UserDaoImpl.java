package com.edu.spring.dao;

import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{
    public void update() {
        System.out.println("userDaoImpl add............");
    }

    public void add() {
        System.out.println("userDao add.......");
    }
}
