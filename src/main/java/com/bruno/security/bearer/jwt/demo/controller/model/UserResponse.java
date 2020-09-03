package com.bruno.security.bearer.jwt.demo.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {

    private String id;
    private String username;
    private String firstName;
    private String secondName;
    private String email;
    private LocalDateTime createdAt;
}
