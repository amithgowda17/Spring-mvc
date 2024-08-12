package com.xworkz.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BikeController {

    public BikeController() {

        System.out.println("BikeController object created ");
    }


    @GetMapping("getSubmit")
    //@PostMapping("Submit") we can't map multiple request
   public String bike1(){
       System.out.println("this bike get method");
       return "Response.jsp";
   }

   @PostMapping("postSubmit")
    public String bike2(){
        System.out.println("this bike post method");
        return "Response.jsp";
    }
}
