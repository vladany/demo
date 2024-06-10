package com.example.demo.cars;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {



    List<Car> findByYearLessThan(int year);
    List<Car> findByCarBranch(String carBranch);
}
// Car puts in db all attributes from model Car