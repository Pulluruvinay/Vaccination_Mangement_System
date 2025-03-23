package com.codedecode.microservices.VaccinationCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;
import com.codedecode.microservices.VaccinationCenter.Model.RequiredResponse;
import com.codedecode.microservices.VaccinationCenter.Services.VaccinationCenterService;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
	
    @Autowired
    private VaccinationCenterService vaccinationCenterService;  // Inject Service

    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
        VaccinationCenter addedCenter = vaccinationCenterService.addVaccinationCenter(vaccinationCenter);
        return new ResponseEntity<>(addedCenter, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id) {
        RequiredResponse response = vaccinationCenterService.getAllDataBasedOnCenterId(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
