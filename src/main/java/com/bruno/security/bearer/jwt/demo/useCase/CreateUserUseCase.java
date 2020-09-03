package com.bruno.security.bearer.jwt.demo.useCase;

import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.CreateUserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final CreateUserGateway createUserGateway;

    public User execute(User user)  {
        return createUserGateway.execute(user);
    }
}
