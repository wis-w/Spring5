package com.edu.spring.aopnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class PersonProxy {
    @Before(value = "execution(* com.edu.spring.aopnno.User.add())")
    public void before(){
        System.out.println("person before");
    }

    @Around(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("person环绕之前");
        proceedingJoinPoint.proceed();// 增强的方法
        System.out.println("person环绕之后");
    }
}
