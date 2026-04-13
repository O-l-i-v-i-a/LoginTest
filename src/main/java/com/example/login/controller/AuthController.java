package com.example.login.controller;

import com.example.login.domain.User;
import com.example.login.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean isValid = authService.login(user);

        if (isValid) {
            return "Login Successful";
        } else {
            return "Invalid Credentials";
        }
    }
}