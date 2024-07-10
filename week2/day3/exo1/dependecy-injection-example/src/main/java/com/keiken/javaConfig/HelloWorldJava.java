package com.keiken.javaConfig;

import com.keiken.javaConfig.interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldJava {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer messageRenderer = (MessageRenderer) ctx.getBean("renderer");

        messageRenderer.render();
    }
}
