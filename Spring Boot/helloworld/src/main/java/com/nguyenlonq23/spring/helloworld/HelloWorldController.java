package com.nguyenlonq23.spring.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${khoahoc.name}")
    private String name;
    @Value("${khoahoc.web}")
    private String web;


    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/index2")
    public String index2() {
        return "name: " + name + ", web: " + web;
    }
}
