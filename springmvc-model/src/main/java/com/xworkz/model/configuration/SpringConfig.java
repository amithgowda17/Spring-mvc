package com.xworkz.model.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.model")
@Configuration
public class SpringConfig {

    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }
}
