package com.springcore.activity_mfw;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationListener {
    @EventListener
    public void handleNotification(NotificationEvent event) {
        System.out.println("SMS listener received: " + event.getMessage());
    }
}