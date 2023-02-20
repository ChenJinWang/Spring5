package com.example.spring5_demo4.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * AOP
 */

@Component
@Aspect
@Order(3)
public class PersonProxy {
    @Pointcut(value = "execution(* com.example.spring5_demo4.aopanno.User.add(..))")
    public void pointdemo(){

    }

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("person before。。。。。");
    }

}
