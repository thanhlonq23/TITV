package com.nguyenlonq23.spring.helloworld.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EmailService implements MessagesService {

    public EmailService() {
        System.out.println("Email Service created");
    }

    @Override
    public String sendMessage() {
        return "From Email: ";
    }
}
