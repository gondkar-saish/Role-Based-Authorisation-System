package com.saish.rolebasedauth.service;

import com.saish.rolebasedauth.dto.AuthResponse;
import com.saish.rolebasedauth.dto.LoginRequest;
import com.saish.rolebasedauth.dto.RegisterRequest;

public interface AuthService {

    String register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}