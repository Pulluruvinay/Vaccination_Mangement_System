package com.codedecode.microservices.CitizenService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column(name = "vaccinationCenterId")
	private int vaccinationCenterId;

	public Citizen() {
	}

	public Citizen(int id, String name, int vaccinationCenterId) {
		this.id = id;
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}
	
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getVaccinationCenterId()=" + getVaccinationCenterId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}
	
	
	
	
	
	
	
	

}
