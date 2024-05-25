package com.example.saeeam.java1stproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class helloworldcontroller {
    
    @RequestMapping("/")
    public String hello() {
        return "Hello Saeeam Java world";
    }

    @RequestMapping("/saeeam")
    public String saeeam() {
        return "Hello Saeeam world";
    }
    
}
