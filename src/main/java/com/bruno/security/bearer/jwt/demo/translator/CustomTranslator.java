package com.bruno.security.bearer.jwt.demo.translator;

import org.modelmapper.ModelMapper;

public class CustomTranslator {

    public static <Input, Output> Output translate(Input in, Class<Output> out){
        return (new ModelMapper()).map(in, out);
    }
}
