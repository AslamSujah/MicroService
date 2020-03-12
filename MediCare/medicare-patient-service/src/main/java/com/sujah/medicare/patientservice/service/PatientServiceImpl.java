package com.sujah.medicare.patientservice.service;

import com.sujah.medicare.common.model.patient.Patient;
import com.sujah.medicare.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> fetchAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient fetchById(int id) {
        Optional<Patient> patient = patientRepository.findById(id);

        if (patient.isPresent()){
            return patient.get();
        }
        else {
            return new Patient();
        }

    }
}