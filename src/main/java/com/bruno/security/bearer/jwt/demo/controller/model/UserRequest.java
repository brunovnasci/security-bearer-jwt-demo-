package com.bruno.security.bearer.jwt.demo.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {

    private String username;
    private String firstName;
    private String secondName;
    private String email;
}