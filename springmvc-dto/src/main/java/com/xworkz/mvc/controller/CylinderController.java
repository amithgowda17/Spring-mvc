package com.xworkz.mvc.controller;


import com.xworkz.mvc.dto.CylinderDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CylinderController {

    public CylinderController() {

        System.out.println("CylinderController object created");
    }

    @PostMapping("cylinder")
    public String getCylinder(CylinderDto dto, Model model){

        System.out.println("cylinder company is==="+dto.getCompanyName());


        model.addAttribute("com_name",dto.getCompanyName());
        model.addAttribute("cus_name",dto.getCustomerName());
        model.addAttribute("price",dto.getCylinderPrice());

        return "Response";
    }
}
