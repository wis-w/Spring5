package com.edu.spring.aopnno;

import org.springframework.stereotype.Component;

/**
 * 被增强类
 */
@Component
public class User {

    public void add(){
        System.out.println("user .add ...");
//        int a = 1/0;
    }
}
