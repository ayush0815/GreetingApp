package com.example.greeting_app.controller;

import com.example.greeting_app.dto.RegisterRequest;
import com.example.greeting_app.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest request) {
        String response = userService.registerUser(request);
        return ResponseEntity.ok(response);
    }
}
