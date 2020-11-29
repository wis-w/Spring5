package com.edu.spring.aopnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect // 表示生成代理对象
@Order(1)
public class UserProxy {

    @Pointcut(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void pointDemo(){}

    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("前置通知");
    }

    @After(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void after(){
        System.out.println("后置通知");// 方法之后执行
    }

    @AfterReturning(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void afterReturning(){
        System.out.println("后置通知:afterReturning");// 返回值之后执行
    }

    @AfterThrowing(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("后置通知:afterThrowing");
    }

    @Around(value = "execution(* com.edu.spring.aopnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();// 增强的方法
        System.out.println("环绕之后");
    }

}
