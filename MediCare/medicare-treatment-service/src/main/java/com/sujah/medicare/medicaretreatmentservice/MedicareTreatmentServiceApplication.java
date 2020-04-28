package com.sujah.medicare.medicaretreatmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.treatment")
@EnableEurekaClient
public class MedicareTreatmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareTreatmentServiceApplication.class, args);
	}

}
