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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`User`")
public class User implements Serializable {
	public User() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="FR_FGES_RAMM_API_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FR_FGES_RAMM_API_USER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Firstname", nullable=true, length=255)	
	private String firstname;
	
	@Column(name="Lastname", nullable=true, length=255)	
	private String lastname;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Birthdate", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date birthdate;
	
	@Column(name="Mobile", nullable=true, length=255)	
	private String mobile;
	
	@OneToOne(mappedBy="user", targetEntity=fr.fges.ramm.api.Adress.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fr.fges.ramm.api.Adress adress;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setBirthdate(java.util.Date value) {
		this.birthdate = value;
	}
	
	public java.util.Date getBirthdate() {
		return birthdate;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setAdress(fr.fges.ramm.api.Adress value) {
		this.adress = value;
	}
	
	public fr.fges.ramm.api.Adress getAdress() {
		return adress;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
