package com.hdfc.bean;

import com.hdfc.service.NotificationService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("Karan")
    private String name;
    @Value(value="60000")
    private double sal;

    @PostConstruct
    public void init(){
        System.out.println("Init logic");
    }
    @Autowired
    private NotificationService notificationService;//---> field injection

    //constructor injection
    public Employee(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void display(){
        System.out.println(name);
        System.out.println(sal);
        notificationService.sendNotification();
    }

}
