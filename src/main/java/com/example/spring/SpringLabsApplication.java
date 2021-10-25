package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringLabsApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringLabsApplication.class, args);
    }
}
