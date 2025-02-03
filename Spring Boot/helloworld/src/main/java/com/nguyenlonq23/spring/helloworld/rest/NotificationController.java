package com.nguyenlonq23.spring.helloworld.rest;

import com.nguyenlonq23.spring.helloworld.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class NotificationController {
//    private MessagesService email;
//
//    @Autowired
//    public NotificationController(@Qualifier("facebookService") MessagesService email) {
//        this.email = email;
//    }
//
//    @GetMapping("/")
//    public String send1() {
//        return "Hello World";
//    }
//
//    @GetMapping("/fb")
//    public String send() {
//        return this.email.sendMessage("Welcome to the Fb App");
//    }
}

