package com.keiken.annotationConfig.implementation;

import com.keiken.annotationConfig.interfaces.MessageRenderer;
import com.keiken.annotationConfig.interfaces.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StdOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null) {
            throw new RuntimeException("You must set messageProvider property. of class: "
                    + StdOutMessageRenderer.class.getName()
            );
        }
        System.out.println(messageProvider.getMessage());
    }

    @Autowired
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}