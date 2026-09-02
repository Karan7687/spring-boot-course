package com.hdfc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class SmsService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sms notification sent successfully");
    }

}
