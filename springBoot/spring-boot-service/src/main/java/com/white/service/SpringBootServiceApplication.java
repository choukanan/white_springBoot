package com.white.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author white
 */

@ComponentScan(basePackages = { "com.white"})
@SpringBootApplication
public class SpringBootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServiceApplication.class, args);
        System.err.println("app start success!");

    }

}
