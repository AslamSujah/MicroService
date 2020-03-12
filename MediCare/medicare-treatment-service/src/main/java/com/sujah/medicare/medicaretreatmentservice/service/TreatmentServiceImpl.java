package com.sujah.medicare.medicaretreatmentservice.service;

import com.sujah.medicare.common.model.treatment.Treatment;
import com.sujah.medicare.medicaretreatmentservice.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    TreatmentRepository treatmentRepository;

    @Override
    public Treatment save(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    @Override
    public List<Treatment> fetchAllTreatment() {
        return treatmentRepository.findAll();
    }

    @Override
    public Treatment fetchById(int id) {
        Optional<Treatment> treatment = treatmentRepository.findById(id);

        if (treatment.isPresent()){
            return treatment.get();
        }
        else {
            return new Treatment();
        }
    }
}
