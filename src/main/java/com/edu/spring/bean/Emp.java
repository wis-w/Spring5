package com.edu.spring.bean;

import lombok.Data;

/**
 * 员工类
 */
@Data
public class Emp {
    private String eName;
    private String gender;
    private Dept dept;// 员工所属的部门
}
