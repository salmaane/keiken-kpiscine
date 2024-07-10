package com.keiken.xmlConfig.implementation;

import com.keiken.xmlConfig.interfaces.MessageProvider;
import com.keiken.xmlConfig.interfaces.MessageRenderer;

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

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
