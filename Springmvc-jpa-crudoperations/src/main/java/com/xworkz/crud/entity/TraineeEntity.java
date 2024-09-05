package com.xworkz.crud.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "trainee_details")
@NamedQuery(name="ReadAll", query = "select entities from TraineeEntity entities")
public class TraineeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "trainee_name")
    private String name;

    @Column(name="trainee_email")
    private String email;

}
