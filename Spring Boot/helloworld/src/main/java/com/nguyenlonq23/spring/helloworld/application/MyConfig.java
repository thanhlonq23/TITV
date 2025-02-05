package com.nguyenlonq23.spring.helloworld.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Calculator getCalculator() {
        return new Calculator();
    }
}
