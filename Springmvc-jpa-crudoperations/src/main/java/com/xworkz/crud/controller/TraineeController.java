package com.xworkz.crud.controller;


import com.xworkz.crud.dto.TraineeDto;
import com.xworkz.crud.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.function.BinaryOperator;

@Controller
@RequestMapping("/")
public class TraineeController {


    @Autowired
    TraineeService traineeService;


    public TraineeController() {

        System.out.println("TraineeController object created");
    }

    @PostMapping("save")
    public String save(@Valid TraineeDto traineeDto, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){

            model.addAttribute("errmsg","Enter valid details");

            return "index";
        }

        String msg=traineeService.saveInService(traineeDto);
        model.addAttribute("success",msg);
        model.addAttribute("dto",traineeDto);
        return "index";
    }


    @GetMapping("getDetails")
    public String readAll(Model model){

        List<TraineeDto> dtoList =traineeService.readAllDromService();

        System.out.println(dtoList);
        model.addAttribute("trainees",dtoList);
        return "ShowTrainees";
    }
}
