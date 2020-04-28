package com.sujah.medicare.patientservice.controller;

import com.sujah.medicare.common.model.patient.Patient;
import com.sujah.medicare.patientservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
@CrossOrigin("http://localhost:4200")
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
