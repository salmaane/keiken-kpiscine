package com.keiken.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.keiken")
@EnableAspectJAutoProxy
public class AppConfig {
}
