package com.sujah.medicare.patientservice.repository;

import com.sujah.medicare.common.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
