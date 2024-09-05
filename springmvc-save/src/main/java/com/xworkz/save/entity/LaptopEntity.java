package com.xworkz.save.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="laptop_details")
@NamedQuery(name="readAll",query = "select entities from LaptopEntity entities")

public class LaptopEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
}
