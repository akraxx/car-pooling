package fr.fges.ramm.service;

import fr.fges.ramm.api.Car;
import fr.fges.ramm.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Maximilien on 11/01/2015.
 */
@Component("carService")
@Transactional
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> findByBrand(String brand) {
        return  carRepository.findByBrandIgnoreCase(brand);
    }
}
