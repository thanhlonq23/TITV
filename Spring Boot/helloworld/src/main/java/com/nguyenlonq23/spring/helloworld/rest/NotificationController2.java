package com.nguyenlonq23.spring.helloworld.rest;

import com.nguyenlonq23.spring.helloworld.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController2 {
    MessagesService emailService;
    MessagesService facebookService;

    @Autowired
    public NotificationController2(@Qualifier("emailService") MessagesService emailService, @Qualifier("facebookService") MessagesService facebookService) {
        this.emailService = emailService;
        this.facebookService = facebookService;
    }

    @GetMapping("/1")
    public String sendFB() {
        return this.facebookService.sendMessage("Welcome to Facebook");
    }

    @GetMapping("/2")
    public String sendEmail() {
        return this.emailService.sendMessage("Welcome to Email");
    }
}
