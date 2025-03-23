package com.codedecode.microservices.CitizenService.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.microservices.CitizenService.Entity.Citizen;
import com.codedecode.microservices.CitizenService.repositories.CitizenRepo;
import com.codedecode.microservices.CitizenService.Service.CitizenService;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    private CitizenRepo citizenRepo;  // Inject the repository

    @Override
    public Citizen saveCitizen(Citizen citizen) {
        return citizenRepo.save(citizen);
    }

    @Override
    public List<Citizen> getCitizensByVaccinationCenterId(Integer id) {
        return citizenRepo.findByVaccinationCenterId(id);
    }
}
