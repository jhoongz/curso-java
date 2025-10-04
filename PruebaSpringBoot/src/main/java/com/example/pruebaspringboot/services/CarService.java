package com.example.pruebaspringboot.services;

import com.example.pruebaspringboot.CarRepository;
import com.example.pruebaspringboot.controllers.requests.NewCarRequest;
import com.example.pruebaspringboot.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getCarByBrand(String brand) {
        List<Car> carList = List.of(
                Car.builder()
                        .brand("BMW")
                        .colour("Silver")
                        .lPlate("ABC123DFG")
                        .mileage(80000.0)
                        .model("M3")
                        .type("coupe")
                        .anio(2005)
                .build(),
                Car.builder()
                        .brand("Dodge")
                        .colour("Black")
                        .lPlate("ABC456DFG")
                        .mileage(160000.0)
                        .model("RAM")
                        .type("Off-Road")
                        .anio(2010)
                        .build()

        );
        return carList;
    }
    public void addNewCar(NewCarRequest request) {

        Car newCar = Car.builder()
                .brand(request.getBrand())
                .colour(request.getColour())
                .lPlate(request.getLPlate())
                .mileage(request.getMileage())
                .model(request.getModel())
                .type(request.getType())
                .anio(request.getAnio())
                .build();
        newCar = carRepository.save(newCar);
        System.out.println(newCar.getId());
    }

    public Optional<Car> getCarById() {
        return carRepository.findById(1L);
    }
}
