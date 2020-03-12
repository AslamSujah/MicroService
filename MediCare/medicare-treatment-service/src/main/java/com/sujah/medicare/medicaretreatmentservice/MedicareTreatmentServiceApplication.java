package com.sujah.medicare.medicaretreatmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.treatment")
public class MedicareTreatmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareTreatmentServiceApplication.class, args);
	}

}
