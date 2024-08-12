package com.xworkz.parameter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FactoryController {

    public FactoryController() {

        System.out.println("FactoryController object created");
    }

    @GetMapping("emp")
    public String empdetails(@RequestParam("name") String name,@RequestParam("c_no") String contact,@RequestParam("doj") String doj){

        System.out.println("name=="+name);
        System.out.println("contact number=="+contact);
        System.out.println("doj=="+doj);

        return "Response.jsp";
    }
}
