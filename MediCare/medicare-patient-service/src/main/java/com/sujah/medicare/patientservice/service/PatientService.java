package com.sujah.medicare.patientservice.service;

import com.sujah.medicare.common.model.patient.Patient;

import java.util.List;

public interface PatientService {

    Patient save(Patient patient);
    List<Patient> fetchAllPatient();
    Patient fetchById(int id);

}
