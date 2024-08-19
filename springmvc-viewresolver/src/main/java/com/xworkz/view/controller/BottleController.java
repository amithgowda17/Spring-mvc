package com.xworkz.view.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BottleController {

    public BottleController() {

        System.out.println("BottleController object created");
    }


    @PostMapping("bottle")
    public String bottle(){

        System.out.println("this is bottlemethod");

        return "Response";
    }

}
