package com.bruno.security.bearer.jwt.demo.gateway.mariadb.exception;

public class GatewayException extends Throwable {

    public GatewayException(String s) {
        super(s);
    }

    public GatewayException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
