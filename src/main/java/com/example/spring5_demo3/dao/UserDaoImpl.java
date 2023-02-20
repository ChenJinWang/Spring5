package com.example.spring5_demo3.dao;

import org.springframework.stereotype.Repository;

@Repository("hello")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("哈哈");
    }
}
