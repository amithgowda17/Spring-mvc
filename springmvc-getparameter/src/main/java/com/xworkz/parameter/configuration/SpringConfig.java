package com.xworkz.parameter.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.parameter")
public class SpringConfig {


    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }
}
