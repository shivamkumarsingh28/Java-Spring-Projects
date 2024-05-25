package com.example.saeeam.java2ndproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String Hello() {
        return "Hello Saeeam Java World";
    }

    @RequestMapping("/saeeam")
    public String requestMethodName() {
        return "Hello SaeeAM World";
    }
    
    
    
}
