package org.example.service;

import org.example.domain.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car getCarByMark(String carMark);
}
