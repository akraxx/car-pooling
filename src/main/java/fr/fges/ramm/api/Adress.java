/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package fr.fges.ramm.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Builder;

import java.io.Serializable;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Adress")
public class Adress implements Serializable {

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_FGES_RAMM_API_ADRESS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_FGES_RAMM_API_ADRESS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=fr.fges.ramm.api.User.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fr.fges.ramm.api.User user;
	
	@Column(name="Line1", nullable=true, length=255)	
	private String line1;
	
	@Column(name="Line2", nullable=true, length=255)	
	private String line2;
	
	@Column(name="Line3", nullable=true, length=255)	
	private String line3;
	
	@Column(name="Zipcode", nullable=true, length=255)	
	private String zipcode;
	
	@Column(name="City", nullable=true, length=255)	
	private String city;
	
	@Column(name="Country", nullable=true, length=255)	
	private String country;

	
}
