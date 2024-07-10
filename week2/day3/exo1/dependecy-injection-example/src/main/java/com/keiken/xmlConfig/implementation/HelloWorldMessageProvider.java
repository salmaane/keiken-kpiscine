package com.keiken.xmlConfig.implementation;

import com.keiken.xmlConfig.interfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World !";
    }
}
