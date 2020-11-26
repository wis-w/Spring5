package com.edu.spring.autowire;

import lombok.Data;

@Data
public class Emp {
    private Dept dept;

    public void test(){
        System.out.println(dept.toString());
    }
}
