package com.sujah.medicare.medicaredoctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.doctor")
public class MedicareDoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareDoctorServiceApplication.class, args);
	}

}
