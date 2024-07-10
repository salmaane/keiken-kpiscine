package com.keiken.annotationConfig.implementation;

import com.keiken.annotationConfig.interfaces.MessageProvider;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World !";
    }
}
