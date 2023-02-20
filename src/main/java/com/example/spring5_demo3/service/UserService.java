package com.example.spring5_demo3.service;

import com.example.spring5_demo3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Autowired
    @Qualifier("hello")
    private UserDao userDao;

    public void testDemo(){
        System.out.println("张三");
        userDao.add();
    }
}
