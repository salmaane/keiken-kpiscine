package com.keiken;


import com.keiken.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Printer printer = (Printer) ctx.getBean("printer");

        printer.print("Hello world !!!!!!!!!!");
    }


}
