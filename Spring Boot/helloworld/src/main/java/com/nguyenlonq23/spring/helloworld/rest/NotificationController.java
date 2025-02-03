package com.nguyenlonq23.spring.helloworld.rest;

import com.nguyenlonq23.spring.helloworld.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private MessagesService email;

    @Autowired
    public NotificationController(MessagesService email) {
        this.email = email;
    }

    @GetMapping("/")
    public String send() {
        return this.email.sendMessage("Xin chao email");
    }

    @GetMapping("/fb")
    public String sendfb() {
        return this.email.sendMessage("Xin chao fb");
    }
}

