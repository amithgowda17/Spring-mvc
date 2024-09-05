package com.xworkz.save.service;

import com.xworkz.save.dto.LaptopDto;
import com.xworkz.save.entity.LaptopEntity;
import com.xworkz.save.repository.LaptopRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class LaptopServiceImpl implements LaptopService {

    public LaptopServiceImpl() {

        System.out.println("LaptopServiceImpl object created");
    }


    @Autowired
    LaptopRepo laptopRepo;


    @Override
    public boolean validate(LaptopDto laptopDto) {

        LaptopEntity laptopEntity = new LaptopEntity();
//        laptopEntity.setName(laptopDto.getName());
//        laptopEntity.setPrice(laptopDto.getPrice());

        BeanUtils.copyProperties(laptopDto, laptopEntity);

        boolean isSaved = laptopRepo.save(laptopEntity);
        return isSaved;
    }

    @Override
    public List<LaptopDto> read() {

        List<LaptopEntity> laptopEntities = laptopRepo.readAll();

        List<LaptopDto> laptopDtos = new ArrayList<>();

        for (LaptopEntity laptopEntity : laptopEntities) {

            LaptopDto dto = new LaptopDto();
            BeanUtils.copyProperties(laptopEntity, dto);

            laptopDtos.add(dto);

        }

        return laptopDtos;
    }


}
