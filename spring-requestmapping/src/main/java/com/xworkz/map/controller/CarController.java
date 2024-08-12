package com.xworkz.map.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CarController {


    public CarController() {

        System.out.println("CarController object created");
    }


    @RequestMapping("car")
    public String car(){
        System.out.println("this is car method");
        return "index.jsp";
    }


    public void tyre(){
        System.out.println("this is tyre method");
    }
}
