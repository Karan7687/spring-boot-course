package org.example;

import com.hdfc.bean.Employee;
import com.hdfc.config.AppConfig;
import com.hdfc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService us = applicationContext.getBean(UserService.class);
//        us.registerUser();

        Employee emp=applicationContext.getBean(Employee.class);
        emp.display();

    }
}

/*
- @Bean helps is creating object manually
- applied on methods returning objects
- that object can be injected after

- method name= id (default)
- that method must be inside class annoted @Configuration


 */