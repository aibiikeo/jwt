package com.example.jwt.dto;

import com.example.jwt.entities.Role;
import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String password;
    private Role role;
}
