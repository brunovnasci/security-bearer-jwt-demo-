package com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository;

import com.bruno.security.bearer.jwt.demo.entity.User;

import java.util.List;

public interface GetAllUsersGateway {

    List<User> execute();
}
