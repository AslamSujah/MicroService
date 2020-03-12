package com.sujah.medicare.medicaremedicineservice.service;

import com.sujah.medicare.common.model.medicine.Medicine;
import com.sujah.medicare.medicaremedicineservice.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineServiceImpl implements MedicineService{

    @Autowired
    MedicineRepository medicineRepository;

    @Override
    public Medicine save(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public List<Medicine> fetchAllMedicine() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine fetchById(int id) {
        Optional<Medicine> medicine = medicineRepository.findById(id);

        if (medicine.isPresent()){
            return medicine.get();
        }
        else {
            return new Medicine();
        }
    }
}
