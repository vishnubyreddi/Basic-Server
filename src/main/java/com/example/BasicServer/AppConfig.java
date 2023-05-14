package com.example.BasicServer;


import Implementation.loginImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public loginImpl login(){
        return new loginImpl();
    }
}
