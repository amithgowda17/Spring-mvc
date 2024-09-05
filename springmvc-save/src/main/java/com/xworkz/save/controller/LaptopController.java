package com.xworkz.save.controller;


import com.xworkz.save.dto.LaptopDto;
import com.xworkz.save.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class LaptopController {

    public LaptopController() {

        System.out.println("LaptopController object created");
    }

    @Autowired
    LaptopService laptopService;


    @RequestMapping("laptop")

    public String saveDetails(@Valid LaptopDto dto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {

            model.addAttribute("msg", "Invalid data resubmit the form");
            return "Response";
        }
        laptopService.validate(dto);
        model.addAttribute("msg1", "Form submitted successfully");
        return "Response";
    }


   @RequestMapping("getDetails")
    public String readDeatils(Model model){

       List<LaptopDto> laptopDtos=laptopService.read();

       System.out.println(laptopDtos);


        return "Response";
    }
}
