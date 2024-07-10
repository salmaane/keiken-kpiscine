package com.keiken.javaConfig;

import com.keiken.javaConfig.implementation.HelloWorldMessageProvider;
import com.keiken.javaConfig.implementation.StdOutMessageRenderer;
import com.keiken.javaConfig.interfaces.MessageProvider;
import com.keiken.javaConfig.interfaces.MessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer messageRenderer = new StdOutMessageRenderer();
        messageRenderer.setMessageProvider(provider());
        return messageRenderer;
    }

}
