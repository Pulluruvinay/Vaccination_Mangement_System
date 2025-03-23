package com.codedecode.microservices.VaccinationCenter.Model;

import java.util.List;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;
public class RequiredResponse {
	private VaccinationCenter center;
	private List<Citizen> citizens;
	
	public RequiredResponse() {
	}

	public RequiredResponse(VaccinationCenter center, List<Citizen> citizens) {
		this.center = center;
		this.citizens = citizens;
	}
	
	public VaccinationCenter getCenter() {
		return center;
	}

	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}

	public List<Citizen> getCitizens() {
		return citizens;
	}

	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	
	@Override
	public String toString() {
		return "RequiredResponse [center=" + center + ", citizens=" + citizens + ", getCenter()=" + getCenter()
				+ ", getCitizens()=" + getCitizens() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

