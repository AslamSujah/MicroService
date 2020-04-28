package com.sujah.medicare.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.patient")
@EnableEurekaClient
public class MedicarePatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicarePatientServiceApplication.class, args);
    }

}
