package com.bruno.security.bearer.jwt.demo.gateway.mariadb.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String s) {
        super(s);
    }

    public UserAlreadyExistsException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
