package com.xworkz.mvc.controller;


import com.xworkz.mvc.dto.BookDto;
import com.xworkz.mvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    BookService bookService;

    public BookController() {

        System.out.println("BookController object created");
    }

    @RequestMapping("book")
    public String getDetails(BookDto dto, Model model){

        model.addAttribute("name","name");
        model.addAttribute("pass","password");
        bookService.data(dto);

        return "Response";
    }
}
