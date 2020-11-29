package com.edu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration// 注解类
@ComponentScan(basePackages = {"com.edu.spring.aopxml"})// 包扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)// 开启Aspect代理
public class ConfigAop {
}
