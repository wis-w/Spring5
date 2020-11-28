package com.edu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration// 作为配置类
@ComponentScan(basePackages = "com.edu.spring")// 包扫描路径
public class SpringConfig {

}
