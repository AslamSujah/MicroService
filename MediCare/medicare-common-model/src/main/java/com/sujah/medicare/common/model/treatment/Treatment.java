package com.sujah.medicare.common.model.treatment;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblTreatment")
@Data
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int patientId;
    int doctorId;
    int medicineId;
    String symptom;
    String disease;
    String date;

}
