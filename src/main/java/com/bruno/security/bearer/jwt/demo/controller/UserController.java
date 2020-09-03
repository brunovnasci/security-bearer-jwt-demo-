package com.bruno.security.bearer.jwt.demo.controller;

import com.bruno.security.bearer.jwt.demo.controller.model.UserRequest;
import com.bruno.security.bearer.jwt.demo.controller.model.UserResponse;
import com.bruno.security.bearer.jwt.demo.entity.User;
import com.bruno.security.bearer.jwt.demo.translator.CustomTranslator;
import com.bruno.security.bearer.jwt.demo.useCase.CreateUserUseCase;
import com.bruno.security.bearer.jwt.demo.useCase.GetAllUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Component
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetAllUsersUseCase getAllUsersUseCase;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        return ResponseEntity.ok(getAllUsersUseCase.execute().stream()
                .map(element -> CustomTranslator.translate(element, UserResponse.class))
                .collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        User response = createUserUseCase.execute(CustomTranslator.translate(userRequest, User.class));
        return ResponseEntity.ok(CustomTranslator.translate(response, UserResponse.class));
    }


}


