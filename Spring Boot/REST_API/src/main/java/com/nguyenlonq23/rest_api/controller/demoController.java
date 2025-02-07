package com.nguyenlonq23.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class demoController {

    @GetMapping("/")
    public String index(){
        return "Hello index!!!";
    }
    @GetMapping("/1")
    public String hello(){
        return "Hello world!!";
    }
}
