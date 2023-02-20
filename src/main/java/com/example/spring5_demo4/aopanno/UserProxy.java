package com.example.spring5_demo4.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {
    @Pointcut(value = "execution(* com.example.spring5_demo4.aopanno.User.add(..))")
    public void pointdemo(){

    }

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before。。。。。");
    }

    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning。。。。。");
    }

    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after。。。。。");
    }
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing。。。。。");
    }
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around之前。。。。。");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("around之后。。。。。");
    }
}
