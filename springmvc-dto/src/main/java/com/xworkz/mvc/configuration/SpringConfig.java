package com.xworkz.mvc.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.mvc")
public class SpringConfig {


    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }


    @Bean
    public ViewResolver getView(){

        ViewResolver viewResolver=new InternalResourceViewResolver("/",".jsp");

        return viewResolver;
    }
}
