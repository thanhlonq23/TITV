package com.nguyenlonq23.spring.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements MessagesService {
    @Override
    public String sendMessage(String message) {
        return "From Email: "+message;
    }
}
