package com.bruno.security.bearer.jwt.demo.gateway.mariadb;

import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.GetAllUsersGateway;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.UserRepository;
import com.bruno.security.bearer.jwt.demo.translator.CustomTranslator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class GetAllUsersGatewayImpl implements GetAllUsersGateway {

    private final UserRepository userRepository;

    @Override
    public List<User> execute() {
        return userRepository.findAll().stream().map(element -> CustomTranslator.translate(element, User.class)).collect(Collectors.toList());
    }
}
