package com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository;

import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.exception.GatewayException;

public interface CreateUserGateway {

    User execute(User user);
}
