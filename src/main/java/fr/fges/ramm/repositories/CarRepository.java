package fr.fges.ramm.repositories;

import fr.fges.ramm.api.Car;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by Maximilien on 11/01/2015.
 */
public interface CarRepository extends Repository<Car, Long> {
    List<Car> findAll();

    List<Car> findByBrandIgnoreCase(String brand);
}
