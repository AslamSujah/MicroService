package com.sujah.medicare.medicaredoctorservice.service;

import com.sujah.medicare.common.model.doctor.Doctor;
import com.sujah.medicare.medicaredoctorservice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> fetchAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor fetchById(int id) {
        Optional<Doctor> doctor = doctorRepository.findById(id);

        if (doctor.isPresent()){
            return doctor.get();
        }
        else {
            return new Doctor();
        }
    }
}
