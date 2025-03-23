package com.codedecode.microservices.CitizenService.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.codedecode.microservices.CitizenService.Entity.Citizen;
import com.codedecode.microservices.CitizenService.Service.CitizenService;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
    @Autowired
    private CitizenService citizenService; // Inject Service

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
	
    @GetMapping("/id/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id) {
        List<Citizen> citizens = citizenService.getCitizensByVaccinationCenterId(id);
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }
	
    @PostMapping("/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
        Citizen citizen = citizenService.saveCitizen(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.OK);
    }
}
