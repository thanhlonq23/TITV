package com.nguyenlonq23.spring.helloworld.service;

import org.springframework.stereotype.Component;

@Component
public class FacebookService implements MessagesService {
    @Override
    public String sendMessage(String message) {
        return "From Facebook: " + message;
    }
}
