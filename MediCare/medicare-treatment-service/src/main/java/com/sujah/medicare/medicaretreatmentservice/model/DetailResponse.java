package com.sujah.medicare.medicaretreatmentservice.model;

import com.sujah.medicare.common.model.doctor.Doctor;
import com.sujah.medicare.common.model.medicine.Medicine;
import com.sujah.medicare.common.model.patient.Patient;
import com.sujah.medicare.common.model.treatment.Treatment;

public class DetailResponse implements Response {
    Treatment treatment;
    Patient patient;
    Doctor doctor;
    Medicine medicine;

    public DetailResponse(Treatment treatment, Patient patient, Doctor doctor, Medicine medicine) {
        this.treatment = treatment;
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
