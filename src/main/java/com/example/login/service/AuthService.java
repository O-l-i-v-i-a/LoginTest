package com.example.login.service;

import com.example.login.domain.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    // Hardcoded user (no DB)
    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "1234";

    public boolean login(User user) {
        return VALID_USERNAME.equals(user.getUsername()) &&
               VALID_PASSWORD.equals(user.getPassword());
    }
}