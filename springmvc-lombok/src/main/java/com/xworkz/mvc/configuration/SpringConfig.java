package com.xworkz.mvc.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz.mvc")
@Configuration
@EnableWebMvc
public class SpringConfig {


    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }

    @Bean
    public ViewResolver resolver(){

        ViewResolver view= new InternalResourceViewResolver("/",".jsp");
        return view;
    }


}
