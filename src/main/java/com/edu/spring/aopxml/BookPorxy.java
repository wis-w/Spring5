package com.edu.spring.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookPorxy {

    @Before(value = "execution(* com.edu.spring.aopxml.Book.buy(..))")
    public void before(){
        System.out.println("before ... ... ...");
    }
}
