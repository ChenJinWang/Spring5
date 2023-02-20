package com.example.spring5_demo4.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
