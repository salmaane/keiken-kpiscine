package com.keiken.xmlConfig;

import com.keiken.xmlConfig.interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldXml {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-context.xml");

        MessageRenderer messageRenderer = (MessageRenderer) ctx.getBean("renderer");

        messageRenderer.render();
    }
}
