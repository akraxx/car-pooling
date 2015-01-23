package fr.fges.ramm.controller;

import fr.fges.ramm.api.Car;
import fr.fges.ramm.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Maximilien on 11/01/2015.
 */
@RestController
@RequestMapping("/car")
@Slf4j
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/")
    public List<Car> findAll() {
        log.info("Find all cars");
        return carService.findAll();
    }

    @RequestMapping("/brand/{brand}")
    public List<Car> findByBrand(@PathVariable String brand) {
        log.info("Find cars by brand [{}]", brand);
        return carService.findByBrand(brand);
    }

}