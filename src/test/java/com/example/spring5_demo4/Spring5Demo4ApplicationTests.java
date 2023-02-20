package com.example.spring5_demo4;

import com.example.spring5_demo4.aopanno.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Spring5Demo4ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
