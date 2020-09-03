package com.bruno.security.bearer.jwt.demo.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Data
public class User {

    private Long id;
    private String username;
    private String firstName;
    private String secondName;
    private String email;
    private LocalDateTime createdAt;
}
