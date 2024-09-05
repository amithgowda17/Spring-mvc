package com.xworkz.validate.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ChocolateDto {


    @NotEmpty(message = "name should not be empty")
    @NotNull(message = "name should not be null")
    @NotBlank(message = "name should not be blank")
    private String name;

    @NotNull(message = "price should not be null")
    @Min(value = 10,message = "minimum price should be 10")
    private Double price;

    @NotNull(message = "quantity should not be null")
    @Min(value=5,message = "minimum quantity should be 5")
    private Integer quantity;
}
