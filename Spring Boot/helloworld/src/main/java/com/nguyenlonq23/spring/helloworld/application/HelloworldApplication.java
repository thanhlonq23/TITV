package com.nguyenlonq23.spring.helloworld.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.nguyenlonq23.spring.helloworld.application",
                "com.nguyenlonq23.spring.helloworld.rest",
                "com.nguyenlonq23.spring.helloworld.service",
        }
)
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);

    }

}
