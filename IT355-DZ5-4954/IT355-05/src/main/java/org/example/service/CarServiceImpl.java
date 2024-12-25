package org.example.service;

import org.example.domain.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private List<Car>carList=new ArrayList<>();
    public CarServiceImpl() {
        carList.add(new Car("Volkswagen", "Golf7", "120,000 km", "1.6 TDI"));
        carList.add(new Car("Toyota", "Corolla", "80,000 km", "1.8 Hybrid"));
        carList.add(new Car("Audi", "A4", "150,000 km", "2.0 TFSI"));
        carList.add(new Car("BMW", "M5", "100,000 km", "4.4 Benzin"));
        carList.add(new Car("Mercedes-Benz", "S63 AMG", "0 km", "4.0 Benzin"));
    }
    @Override
    public List<Car> getAll() {
        return carList;
    }

    @Override
    public Car getCarByMark(String carMark) {
        Optional<Car> optionalCar = findCarByMark(carList, carMark);
        return optionalCar.orElse(null);
    }
    public Optional<Car> findCarByMark(List<Car> cars, String mark) {
        return cars.stream()
                .filter(car -> car.getMark().equals(mark))
                .findFirst();
    }
}
