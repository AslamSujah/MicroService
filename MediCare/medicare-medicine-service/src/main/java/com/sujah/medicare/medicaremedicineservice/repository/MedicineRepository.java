package com.sujah.medicare.medicaremedicineservice.repository;

import com.sujah.medicare.common.model.medicine.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
