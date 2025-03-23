package com.codedecode.microservices.VaccinationCenter.Services;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;
import com.codedecode.microservices.VaccinationCenter.Model.RequiredResponse;

public interface VaccinationCenterService {
    
    VaccinationCenter addVaccinationCenter(VaccinationCenter vaccinationCenter); // Save a new center
    
    RequiredResponse getAllDataBasedOnCenterId(Integer centerId); // Fetch center and registered citizens
}
