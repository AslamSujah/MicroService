package com.sujah.medicare.medicaretreatmentservice.service;

import com.sujah.medicare.common.model.treatment.Treatment;
import com.sujah.medicare.medicaretreatmentservice.model.DetailResponse;
import com.sujah.medicare.medicaretreatmentservice.model.Response;

import java.util.List;

public interface TreatmentService {

    Treatment save(Treatment treatment);
    List<Treatment> fetchAllTreatment();
    Treatment fetchById(int id);

    DetailResponse fetchDetailResponse(int treatmentId);
}
