package com.sujah.medicare.patientservice.service;

import com.sujah.medicare.common.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    Patient save(Patient patient);
    List<Patient> fetchAllPatient();
    Patient fetchById(int id);

}
