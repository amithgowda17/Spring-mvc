package com.xworkz.save.service;

import com.xworkz.save.dto.LaptopDto;

import java.util.List;

public interface LaptopService {

    boolean validate(LaptopDto laptopDto);


    List<LaptopDto> read();
}
