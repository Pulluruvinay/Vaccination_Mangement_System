package com.codedecode.microservices.VaccinationCenter.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;
import com.codedecode.microservices.VaccinationCenter.Model.Citizen;
import com.codedecode.microservices.VaccinationCenter.Model.RequiredResponse;
import com.codedecode.microservices.VaccinationCenter.Repos.CenterRepo;
import com.codedecode.microservices.VaccinationCenter.Services.VaccinationCenterService;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService {

    @Autowired
    private CenterRepo centerRepo;  // Inject Repository

    @Autowired
    private RestTemplate restTemplate; // Inject RestTemplate for API calls

    @Override
    public VaccinationCenter addVaccinationCenter(VaccinationCenter vaccinationCenter) {
        return centerRepo.save(vaccinationCenter);
    }

    @Override
    public RequiredResponse getAllDataBasedOnCenterId(Integer centerId) {
        RequiredResponse requiredResponse = new RequiredResponse();
        
        // Get Vaccination Center details
        VaccinationCenter center = centerRepo.findById(centerId).orElse(null);
        requiredResponse.setCenter(center);

        // Get all citizens registered to the vaccination center
        List<Citizen> citizensList = restTemplate.getForObject(
                "http://CITIZEN-SERVICE/citizen/id/" + centerId, List.class);
        requiredResponse.setCitizens(citizensList);

        return requiredResponse;
    }
}
