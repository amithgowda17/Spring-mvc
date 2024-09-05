package com.xworkz.save.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.save")
@EnableWebMvc
public class SpringConfig {


    public SpringConfig() {

        System.out.println("SpringConfig object created");
    }


    @Bean

    public ViewResolver resolver(){

     ViewResolver viewResolver  = new InternalResourceViewResolver("/",".jsp");

        return viewResolver;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean getManagerFactoryBean(){

        LocalContainerEntityManagerFactoryBean  managerFactoryBean =new LocalContainerEntityManagerFactoryBean();
        return managerFactoryBean;

    }


    
}
