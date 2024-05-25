package com.example.javamongodb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class Mongodbconnect {
    @RequestMapping("/")
    public String mongodbconnect() {
        return "DataBase Connect With Springboot";
    }
    
}
