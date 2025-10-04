package com.example.pruebaspringboot.controllers.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewCarRequest {
    private String brand;
    private String model;
    private String lPlate;
    private Integer anio;
    private Double mileage;
    private String colour;
    private String type;

}
