package com.nguyenlonq23.spring.helloworld.rest;

import com.nguyenlonq23.spring.helloworld.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    MessagesService messagesService;

    @GetMapping("/1")
    public String send1() {
        return this.messagesService.sendMessage();
    }

    @Autowired
    public void setMessagesService(@Qualifier("emailService") MessagesService messagesService) {
        this.messagesService = messagesService;
    }
}

