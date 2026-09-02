package com.hdfc.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //constructor injection, @Autowired is optional
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Autowired
    private NotificationService notificationService;

    public void registerUser() {
        System.out.println("User registered");
        notificationService.sendNotification();

    }
}
