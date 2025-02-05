package com.nguyenlonq23.spring.helloworld.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Calculator mt;

    @Autowired
    public Controller(Calculator mt) {
        this.mt = mt;
    }

    @GetMapping("/sqrt")
    public String sqrt(@RequestParam("value") double x) {
        return "Can bac 2 = " + mt.sqrt(x);
    }

    @GetMapping("/pow")
    public String pow(@RequestParam("value") double x) {
        return "Binh phuong = " + mt.pow(x, 2);
    }
}
