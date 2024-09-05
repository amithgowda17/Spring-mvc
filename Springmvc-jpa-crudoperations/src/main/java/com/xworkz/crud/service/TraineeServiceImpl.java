package com.xworkz.crud.service;

import com.xworkz.crud.dto.TraineeDto;
import com.xworkz.crud.entity.TraineeEntity;
import com.xworkz.crud.repository.TraineeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class TraineeServiceImpl implements TraineeService {


    @Autowired
    TraineeRepo traineeRepo;

    @Override
    public String saveInService(TraineeDto traineeDto) {


        System.out.println("dto in service=="+traineeDto);


        TraineeEntity traineeEntity = new TraineeEntity();

        BeanUtils.copyProperties(traineeDto, traineeEntity);

        boolean isSaved = traineeRepo.saveInRepo(traineeEntity);

        if (isSaved == true) {
            return "Data Saved Sucessfully";
        }
        return "data not saved";
    }

    @Override
    public List<TraineeDto> readAllDromService() {

        List<TraineeEntity> traineeEntities=traineeRepo.readAllFromRepo();

        List<TraineeDto> traineeDtosList=new ArrayList<>();

        if(!traineeEntities.isEmpty()) {
            for (TraineeEntity traineeEntity : traineeEntities) {

                TraineeDto traineeDto = new TraineeDto();

                BeanUtils.copyProperties(traineeEntity,traineeDto);

                traineeDtosList.add(traineeDto);

            }


            return traineeDtosList;
        }
        return null;
    }
}
