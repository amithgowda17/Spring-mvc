package com.xworkz.crud.repository;

import com.xworkz.crud.entity.TraineeEntity;

import java.util.List;

public interface TraineeRepo {

    boolean saveInRepo(TraineeEntity traineeEntity);

    List<TraineeEntity> readAllFromRepo();
}
