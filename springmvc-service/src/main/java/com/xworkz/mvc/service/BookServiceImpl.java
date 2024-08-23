package com.xworkz.mvc.service;

import com.xworkz.mvc.dto.BookDto;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{


    public BookServiceImpl() {
        System.out.println("BookServiceImpl created");
    }

    @Override
    public boolean data(BookDto dto) {

        System.out.println("running BookServiceImpl class");
        System.out.println(dto.getName());
        System.out.println(dto.getPassword());
        return true;
    }
}
