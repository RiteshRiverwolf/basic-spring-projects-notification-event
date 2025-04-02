package com.springcore.activity_mfw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    //@Autowired
    private final ApplicationEventPublisher eventPublisher;

//    public void sendNotification(String message) {
//        System.out.println("Publishing notification: " + message);
//        NotificationEvent event = new NotificationEvent(this, message);
//        eventPublisher.publishEvent(event);
//    }
    
    public NotificationService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void sendNotification(String message) {
        System.out.println("publishing notification: " + message);
        eventPublisher.publishEvent(new NotificationEvent(this, message));
    }
}