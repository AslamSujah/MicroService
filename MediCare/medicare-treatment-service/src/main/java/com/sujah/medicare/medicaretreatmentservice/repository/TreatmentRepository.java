package com.sujah.medicare.medicaretreatmentservice.repository;

import com.sujah.medicare.common.model.treatment.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
}
