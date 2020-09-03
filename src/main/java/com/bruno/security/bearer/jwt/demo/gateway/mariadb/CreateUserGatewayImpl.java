package com.bruno.security.bearer.jwt.demo.gateway.mariadb;

import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.exception.GatewayException;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.exception.UserAlreadyExistsException;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.model.UserDBDomain;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.CreateUserGateway;
import com.bruno.security.bearer.jwt.demo.gateway.mariadb.repository.UserRepository;
import com.bruno.security.bearer.jwt.demo.translator.CustomTranslator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
@RequiredArgsConstructor
public class CreateUserGatewayImpl implements CreateUserGateway {

    private final UserRepository userRepository;

    @Override
    public User execute(User user) {
        UserDBDomain userDBDomain = null;
        try {
            userDBDomain = userRepository.save(CustomTranslator.translate(user, UserDBDomain.class));
        } catch (Exception e) {
            if (e.getMessage().startsWith("Duplicate entry '")){
                System.out.println("entrouu");
                throw new UserAlreadyExistsException("Username '"+ user.getUsername()+"' already exists", e);
            }
            throw e;
        }
        return CustomTranslator.translate(userDBDomain, User.class);
    }
}
