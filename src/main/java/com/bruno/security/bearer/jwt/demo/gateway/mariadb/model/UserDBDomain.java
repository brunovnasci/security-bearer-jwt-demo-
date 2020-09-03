package com.bruno.security.bearer.jwt.demo.gateway.mariadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDBDomain implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String secondName;
    private String email;
    private LocalDateTime createdAt = LocalDateTime.now();
}
