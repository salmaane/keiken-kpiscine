package com.keiken.annotationConfig;

import com.keiken.annotationConfig.interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldAnnotation {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageRenderer messageRenderer = (MessageRenderer) ctx.getBean("stdOutMessageRenderer");

        messageRenderer.render();
    }
}
