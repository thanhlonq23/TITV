package com.nguyenlonq23.spring.helloworld.rest;

import com.nguyenlonq23.spring.helloworld.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    MessagesService emailService;
    MessagesService facebookService;

//    public NotificationController(MessagesService messagesService) {
//        this.messagesService = messagesService;
//    }

    @Autowired
    public void setFacebookService(@Qualifier("facebookService") MessagesService facebookService) {
        this.facebookService = facebookService;
    }

    @Autowired
    public void setEmailService(@Qualifier("emailService") MessagesService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/1")
    public String send1() {
        return this.facebookService.sendMessage("Welcome to Facebook");
    }

    @GetMapping("/2")
    public String send2() {
        return this.emailService.sendMessage("Welcome to Email1");
    }
}

