package com.smartcontact.smartcontact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class homeController {

    // @Autowired
    // private UserRepository userRepository;

    @GetMapping("/test")
    public String test() {
        // User user = new User();
        // user.setName("Saeeam");
        // user.setEmail("saeeam@gmail.com");
        // userRepository.save(user);
        return "working";
    }
    
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home-Page");
        return "home";
    }


    
}
