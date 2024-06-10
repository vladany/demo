package com.example.demo.cars;


import com.example.demo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id).orElseThrow();
    }

    @GetMapping("/branch/{carBranch}")
    public List<Car> getCarsByCarBranch(@PathVariable String carBranch) {
        return carRepository.findByCarBranch(carBranch);
    }

    @GetMapping("/olderThan/{year}")
    public List<Car> getCarsOlderThan(@PathVariable int year) {
        return carRepository.findByYearLessThan(year);
    }

}
