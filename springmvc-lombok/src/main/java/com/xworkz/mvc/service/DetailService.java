package com.xworkz.mvc.service;

import com.xworkz.mvc.dto.DetailsDto;
import org.springframework.stereotype.Service;


public interface DetailService {

    boolean save(DetailsDto detailsDto);
}
