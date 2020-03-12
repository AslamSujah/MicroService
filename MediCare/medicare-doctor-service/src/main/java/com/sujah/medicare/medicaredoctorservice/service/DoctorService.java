package com.sujah.medicare.medicaredoctorservice.service;

import com.sujah.medicare.common.model.doctor.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor save(Doctor doctor);
    List<Doctor> fetchAllDoctor();
    Doctor fetchById(int id);

}
