package com.hdfc.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private NotificationService notificationService;

    public void registerUser() {
        System.out.println("User registered");
        notificationService.sendNotification();

    }
}
