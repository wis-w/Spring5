package com.edu.spring.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println("返回值："+ add);
    }

}
// 创建代理对象方法
class UserDaoProxy implements InvocationHandler{
    // 创建的是谁的代理对象，就需要把谁传进来
    // 通过有参构造
    public Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }
    // 增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在方法前做增强
        System.out.println("在增强方法前做的操作...."+method.getName()+"  参数"+ Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(args);
        // 在方法后的操作
        System.out.println("在增强的方法后的操作...");
        return res;
    }
}
