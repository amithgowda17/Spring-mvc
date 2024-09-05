package com.xworkz.save.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto {


    @NonNull
    @NotBlank
    @NotEmpty
    private String name;

    @NotNull
    @Min(value = 20000)
    private int price;
}
