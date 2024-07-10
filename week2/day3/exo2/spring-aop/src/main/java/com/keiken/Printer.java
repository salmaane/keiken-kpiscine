package com.keiken;

import com.keiken.annotation.TimeIt;
import org.springframework.stereotype.Component;

@Component
public class Printer {

    @TimeIt
    public void print(String message) throws InterruptedException {

        Thread.sleep(100);

        System.out.println(message);
    }

}
