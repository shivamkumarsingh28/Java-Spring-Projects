package com.example.auth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
// import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.example.auth.models.User;

@Service
public class UserService {
    
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "saeeam singh", "saeeam@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "shivam singh", "shivam@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "kaliya singh", "skaliya@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
