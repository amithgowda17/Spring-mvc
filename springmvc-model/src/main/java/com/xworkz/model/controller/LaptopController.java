package com.xworkz.model.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Component
@RequestMapping("/")
public class LaptopController {


    public LaptopController() {

        System.out.println("LaptopController object created");
    }


    @RequestMapping("details")
    public String details(Model model, @RequestParam("name") String name, @RequestParam("email") String email,
                          @RequestParam("password") String password, @RequestParam("age") String age) {

        model.addAttribute("x",name);
        model.addAttribute("y",email);
        model.addAttribute("z",password);
        model.addAttribute("a",age);

        return "Response.jsp";
    }
}
