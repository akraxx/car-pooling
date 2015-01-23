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
import java.io.Serializable;

/**
 * Created by Maximilien on 11/01/2015.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity(name = "USER")
public class User implements Serializable {
    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name = "last_name", nullable = false)
    public String lastName;
}
