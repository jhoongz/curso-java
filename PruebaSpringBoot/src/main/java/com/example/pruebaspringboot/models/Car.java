package com.example.pruebaspringboot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String brand;
    private String model;
    private String lPlate;
    private Integer anio;
    private Double mileage;
    private String colour;
    private String type;
}
