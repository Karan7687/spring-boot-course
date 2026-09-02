package com.hdfc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.*;

@Service
@Primary
public class EmailService implements NotificationService{
    public void sendNotification() {

        System.out.println("Email Notification sent successfully");
    }
}
