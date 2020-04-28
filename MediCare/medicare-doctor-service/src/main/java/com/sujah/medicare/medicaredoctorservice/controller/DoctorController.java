package com.sujah.medicare.medicaredoctorservice.controller;

import com.sujah.medicare.common.model.doctor.Doctor;
import com.sujah.medicare.medicaredoctorservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
@CrossOrigin("http://localhost:4200")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping(value = "/doctor", method = RequestMethod.POST)
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.save(doctor);
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public List<Doctor> fetchAllDoctor(){
        return doctorService.fetchAllDoctor();
    }

    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    public Doctor fetchById(@RequestParam int doctorId){
        return doctorService.fetchById(doctorId);
    }

}
