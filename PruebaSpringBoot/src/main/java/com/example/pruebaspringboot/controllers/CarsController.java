package com.example.pruebaspringboot.controllers;

import com.example.pruebaspringboot.controllers.requests.NewCarRequest;
import com.example.pruebaspringboot.models.Car;
import com.example.pruebaspringboot.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auto")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/brand")
    public ResponseEntity<List<Car>> getCarByBrand() {

        return new ResponseEntity<>(carService.getCarByBrand("BMW"), HttpStatus.OK );
    }

    @PostMapping()
    public void newCar(@RequestBody NewCarRequest request) {
        carService.addNewCar(request);
    }

    @GetMapping("/id")
    public ResponseEntity<Optional<Car>> getCarById() {

        return new ResponseEntity<>(carService.getCarById(), HttpStatus.OK );
    }
}
