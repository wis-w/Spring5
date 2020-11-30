package com.edu.springJDBC.entity;

import lombok.Data;

/**
 * 数据库映射类
 */
@Data
public class Book {
    private int userId;
    private String username;
    private String status;

    public Book(int userId, String username, String status) {
        this.userId = userId;
        this.username = username;
        this.status = status;
    }

    public Book(String username, String status) {
        this.username = username;
        this.status = status;
    }

    public Book() {
    }
}
