package com.xworkz.crud.service;

import com.xworkz.crud.dto.TraineeDto;

import java.util.List;

public interface TraineeService {

    String saveInService(TraineeDto traineeDto);

    List<TraineeDto> readAllDromService();
}
