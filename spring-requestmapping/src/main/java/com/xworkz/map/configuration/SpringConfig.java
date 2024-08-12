package com.xworkz.map.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.xworkz.map")
@Component
public class SpringConfig {


    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }
}
