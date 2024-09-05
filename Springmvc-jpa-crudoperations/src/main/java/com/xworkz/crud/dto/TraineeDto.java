package com.xworkz.crud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TraineeDto {


    private Integer id;

    @NotNull(message = "Trainee name should not be null")
    @NotEmpty(message = "Trainee name should not be empty")
    @NotBlank(message = "Trainee name should not be blank")
    private String name;


    @NotNull(message = "Trainee email should not be null")
    @NotEmpty(message = "Trainee email should not be empty")
    @NotBlank(message = "Trainee email should not be blank")
    private String email;
}
