package com.bruno.security.bearer.jwt.demo.useCase;

import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.GetAllUsersGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllUsersUseCase {

    private final GetAllUsersGateway getAllUsersGateway;

    public List<User> execute() {
        return getAllUsersGateway.execute();
    }
}
