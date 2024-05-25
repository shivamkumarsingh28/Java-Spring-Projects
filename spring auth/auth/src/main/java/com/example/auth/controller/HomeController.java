package com.example.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.auth.models.User;
import com.example.auth.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        System.out.println("Hello user welcome");
        return userService.getUsers();
    }


    @GetMapping("")
    public String getLoggingUser(Principal principal) {
        return principal.getName();
    }
    
    
}
