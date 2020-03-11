package com.sujah.medicare.patientservice.controller;

import com.sujah.medicare.common.model.Patient;
import com.sujah.medicare.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/services")
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    public Patient save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public List<Patient> fetchAllPatient(){
        return patientService.fetchAllPatient();
    }

    @RequestMapping(value = "/patient", method = RequestMethod.GET)
    public Patient fetchById(@RequestParam int patientId){
        return patientService.fetchById(patientId);
    }

    
}
