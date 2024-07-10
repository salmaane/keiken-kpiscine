package com.keiken.javaConfig.implementation;

import com.keiken.javaConfig.interfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World !";
    }
}
