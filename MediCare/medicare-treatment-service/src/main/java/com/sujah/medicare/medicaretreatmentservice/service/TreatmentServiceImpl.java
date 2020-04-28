package com.sujah.medicare.medicaretreatmentservice.service;

import com.sujah.medicare.common.model.doctor.Doctor;
import com.sujah.medicare.common.model.medicine.Medicine;
import com.sujah.medicare.common.model.patient.Patient;
import com.sujah.medicare.common.model.treatment.Treatment;
import com.sujah.medicare.medicaretreatmentservice.model.DetailResponse;
import com.sujah.medicare.medicaretreatmentservice.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    TreatmentRepository treatmentRepository;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

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

    @Override
    public DetailResponse fetchDetailResponse(int treatmentId) {
        Treatment treatment = fetchById(treatmentId);

        Patient patient = getPatientFromOtherService(treatment.getPatientId());
        Doctor doctor = getDoctorFromOtherService(treatment.getDoctorId());
        Medicine medicine =getMedicineFromOtherService(treatment.getMedicineId());

        return new DetailResponse(treatment, patient, doctor,medicine);
    }

    private Patient getPatientFromOtherService(int pId){
        Patient patient = restTemplate.getForObject("http://patient/services/patient?patientId="+pId, Patient.class);
        return patient;
    }

    private Doctor getDoctorFromOtherService(int dId){
        Doctor doctor = restTemplate.getForObject("http://doctor/services/doctor?doctorId="+dId, Doctor.class);
        return doctor;
    }

    private Medicine getMedicineFromOtherService(int mId){
        Medicine medicine = restTemplate.getForObject("http://medicine/services/medicine?medicineId="+mId, Medicine.class);
        return  medicine;
    }
}
