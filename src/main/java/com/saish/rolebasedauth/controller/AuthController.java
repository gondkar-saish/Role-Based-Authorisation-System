package com.saish.rolebasedauth.controller;

import com.saish.rolebasedauth.dto.AuthResponse;
import com.saish.rolebasedauth.dto.LoginRequest;
import com.saish.rolebasedauth.dto.RegisterRequest;
import com.saish.rolebasedauth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterRequest request) {

        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {

        return authService.login(request);
    }
}