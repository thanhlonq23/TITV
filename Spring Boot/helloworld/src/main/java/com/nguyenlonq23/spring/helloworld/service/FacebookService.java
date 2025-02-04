package com.nguyenlonq23.spring.helloworld.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FacebookService implements MessagesService {

    public FacebookService(){
        System.out.println("Constructor của lớp : " + getClass().getSimpleName());
    }

    @Override
    public String sendMessage( ) {
        return "From Facebook: ";
    }
}
