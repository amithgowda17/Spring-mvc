package com.xworkz.mvc.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DetailsDto {


    @NotNull(message = "name should not be null")
    @NotBlank(message = "name should not be blank")
    @NotEmpty(message = "name should not be empty")
    private String name;

    @NotNull
    @Min(value = 18,message = "should be 18+")
    private Integer age;

    @NotNull
    @NotEmpty
    @NotEmpty
    private String password;
}
