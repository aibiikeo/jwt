package com.example.jwt.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String refreshToken;
}
