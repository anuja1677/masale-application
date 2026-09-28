package com.example.masale_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.masale_app.entities.Userdata;
import com.example.masale_app.repository.UserReopsitory;

@RestController
@RequestMapping("/api")
public class Authcontroller {

    @Autowired
    private UserReopsitory userRepo;

    // 🔑 Login API
    @PostMapping("/login")
    public String login(@RequestBody Userdata user) {

        Userdata dbUser = userRepo.findByUsername(user.getUsername());

        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {

            if (dbUser.getRole().equals("ADMIN")) {
                return "ADMIN LOGIN SUCCESS";
            } else {
                return "USER LOGIN SUCCESS";
            }
        }

        return "Invalid Username or Password";
    }
}