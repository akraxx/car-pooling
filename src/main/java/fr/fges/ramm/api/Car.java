package fr.fges.ramm.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Maximilien on 11/01/2015.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "CAR")
public class Car {
    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "brand", nullable = false)
    public String brand;
}
