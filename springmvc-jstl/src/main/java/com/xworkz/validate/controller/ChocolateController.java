package com.xworkz.validate.controller;


import com.xworkz.validate.dto.ChocolateDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ChocolateController {

    public ChocolateController() {

        System.out.println("ChocolateController object created");
    }


    @PostMapping("/choco")

    public String saveChoco(@Valid ChocolateDto chocolateDto, BindingResult bindingResult, Model model){

       List<ObjectError> errors =bindingResult.getAllErrors();

       if(bindingResult.hasErrors()){

           List<String> defaultErrors=new ArrayList<>();

           for(ObjectError err:errors){

               defaultErrors.add(err.getDefaultMessage());
           }
           System.out.println(defaultErrors);

           model.addAttribute("error",defaultErrors);

           return "Response";
       }
        return "index";
    }
}
