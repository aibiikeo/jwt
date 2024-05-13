package com.example.jwt.services;

import com.example.jwt.dto.JwtAuthResponse;
import com.example.jwt.dto.RefreshTokenRequest;
import com.example.jwt.dto.SignUpRequest;
import com.example.jwt.dto.SigninRequest;
import com.example.jwt.entities.User;

public interface AuthService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthResponse signin(SigninRequest signinRequest);
    JwtAuthResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

}
