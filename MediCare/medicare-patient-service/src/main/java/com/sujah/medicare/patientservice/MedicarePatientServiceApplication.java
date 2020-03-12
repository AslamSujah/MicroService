package com.sujah.medicare.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.patient")
public class MedicarePatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicarePatientServiceApplication.class, args);
    }

}
