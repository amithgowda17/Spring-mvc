package com.xworkz.mvc.service;

import com.xworkz.mvc.dto.DetailsDto;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl implements DetailService {


    @Override
    public boolean save(DetailsDto detailsDto) {
        return true;
    }
}
