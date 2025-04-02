package com.springcore.activity_mfw;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {
    @EventListener
    public void handleNotification(NotificationEvent event) {
        System.out.println("email listener received: " + event.getMessage());
    }
}
