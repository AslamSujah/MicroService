package com.sujah.medicare.common.model.patient;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tblPatient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String age;
    String gender;
    String contactNo;

}
