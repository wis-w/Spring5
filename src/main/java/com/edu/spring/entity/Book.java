package com.edu.spring.entity;

public class Book {
    private String bName;

    private String bauthor;

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    // 有参构造注入
    public Book(String bName) {
        this.bName = bName;
    }

    public Book() {

    }

    // set方法注入
    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbName() {
        return bName;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
