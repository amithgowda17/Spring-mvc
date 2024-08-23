package com.xworkz.mvc.controller;


import com.xworkz.mvc.dto.DetailsDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class DetailsController {


    public DetailsController() {

        System.out.println("DetailsController object created");
    }


    @GetMapping("detail")

    public String getDetail(@Valid DetailsDto detailsDto, BindingResult bindingResult, Model model) {

        List<ObjectError> allErrors = bindingResult.getAllErrors();

        List<String> errors=new ArrayList<>();

        if(bindingResult.hasErrors()) {
            for (ObjectError err : allErrors) {

                errors.add(err.getDefaultMessage());

            }

            System.out.println(errors);
            model.addAttribute("msg", errors);

            return "Invalid";
        }



        return "index";
    }
}
