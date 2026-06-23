package com.saish.rolebasedauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/home")
    public String userHome() {

        return "Welcome USER. This API is accessible by USER and ADMIN.";
    }
}