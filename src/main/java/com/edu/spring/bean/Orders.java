package com.edu.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Orders {
    public Orders() {
        System.out.println("第一步,通过无参构造创建对象");
    }

    private String oName;

    public void setoName(String oName) {
        System.out.println("第二步,通过set方法进行属性注入");
        this.oName = oName;
    }
    // 创建执行的初始化方法
    // 在bean中的init-method="initMethod"指定初始化方法
    public void initMethod(){
        System.out.println("第三步,执行初始化方法");
    }

    // destroy-method="destroyMethod" 在xml中指定
    public void destroyMethod(){
        System.out.println("第五步,执行了销毁方法");
    }

    public static void main(String[] args) {
        ApplicationContext context4 = new ClassPathXmlApplicationContext("classpath:bean4.xml");
        Orders orders = context4.getBean("orders", Orders.class);
        System.out.println(orders.toString());
        System.out.println("第四步,获取创建的对象");

        // 手动销毁bean
        ((ClassPathXmlApplicationContext)context4).close();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oName='" + oName + '\'' +
                '}';
    }
}
