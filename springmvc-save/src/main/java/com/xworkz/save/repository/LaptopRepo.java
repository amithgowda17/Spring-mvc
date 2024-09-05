package com.xworkz.save.repository;

import com.xworkz.save.entity.LaptopEntity;

import java.util.List;

public interface LaptopRepo {

    boolean save(LaptopEntity laptopEntity);

    List<LaptopEntity>  readAll();
}
