package com.xworkz.map.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.map")
public class SpringConfig {


    public SpringConfig() {

        System.out.println(" springconfig object created");
    }
}
