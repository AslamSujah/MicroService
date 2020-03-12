package com.sujah.medicare.medicaredoctorservice.repository;

import com.sujah.medicare.common.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
