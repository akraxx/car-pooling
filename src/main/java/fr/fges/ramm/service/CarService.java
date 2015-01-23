package fr.fges.ramm.service;

import fr.fges.ramm.api.Car;

import java.util.List;

/**
 * Created by Maximilien on 11/01/2015.
 */
public interface CarService {
    List<Car> findAll();

    List<Car> findByBrand(String brand);
}
