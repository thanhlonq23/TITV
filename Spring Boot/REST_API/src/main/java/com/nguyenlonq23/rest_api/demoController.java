package com.nguyenlonq23.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class demoController {

    @GetMapping("/")
    public String index() {
        return "Hello index!!!";
    }

    @GetMapping("/1")
    public String hello() {
        return "Hello world!!";
    }

    @GetMapping("/2/{id}")
    public String getId(@PathVariable int id) {
        return "Id is: " + id;
    }
}
