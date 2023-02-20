package com.example.spring5_demo3;

import com.example.spring5_demo3.config.SpringConfig;
import com.example.spring5_demo3.service.UserService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Spring5Demo3ApplicationTests {

    @org.junit.jupiter.api.Test
    void contextLoads() {
    }

    @org.junit.jupiter.api.Test
    public void Demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService test = context.getBean("userService", UserService.class);
        test.testDemo();
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    public void Demo1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService test = context.getBean("userService", UserService.class);
        test.testDemo();
        System.out.println(test);
    }

}
