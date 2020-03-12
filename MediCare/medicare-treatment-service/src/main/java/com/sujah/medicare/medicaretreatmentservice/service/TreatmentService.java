package com.sujah.medicare.medicaretreatmentservice.service;

import com.sujah.medicare.common.model.treatment.Treatment;

import java.util.List;

public interface TreatmentService {

    Treatment save(Treatment treatment);
    List<Treatment> fetchAllTreatment();
    Treatment fetchById(int id);

}
