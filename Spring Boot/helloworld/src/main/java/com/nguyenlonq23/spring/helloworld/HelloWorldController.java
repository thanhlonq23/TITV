package com.nguyenlonq23.spring.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/index2")
    public String index2() {
        return "Xin chào";
    }
}
