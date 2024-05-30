package com.example.mysqlconnect.mysqlconnect.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class Homecontroller {
    
    @RequestMapping("/")
    public String home() {
        return new String("Hello mysql not connect error solve");
    }
    
}
