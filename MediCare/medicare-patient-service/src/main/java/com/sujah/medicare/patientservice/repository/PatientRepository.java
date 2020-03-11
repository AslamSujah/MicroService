package com.sujah.medicare.patientservice.repository;

import com.sujah.medicare.common.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
