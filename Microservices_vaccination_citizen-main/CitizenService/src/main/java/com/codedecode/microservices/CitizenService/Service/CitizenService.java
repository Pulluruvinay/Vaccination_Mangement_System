package com.codedecode.microservices.CitizenService.Service;
import java.util.List;
import com.codedecode.microservices.CitizenService.Entity.Citizen;
public interface CitizenService {
	
	 Citizen saveCitizen(Citizen citizen); // Save a new citizen

	    List<Citizen> getCitizensByVaccinationCenterId(Integer id); // Get citizens by center ID

	

}
