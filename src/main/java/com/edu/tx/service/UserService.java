package com.edu.tx.service;

import com.edu.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void countMoney(){
        userDao.reduceMoney();// 账户减少
        int a = 1 / 0;// 模拟异常
        userDao.addMoney();// 账户增加
    }
}
