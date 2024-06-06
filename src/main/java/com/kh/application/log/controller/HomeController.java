package com.kh.application.log.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello, welcome to see you!";
    }
}
