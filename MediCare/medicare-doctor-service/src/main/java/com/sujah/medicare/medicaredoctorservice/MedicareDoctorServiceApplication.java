package com.sujah.medicare.medicaredoctorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.doctor")
@EnableEurekaClient
public class MedicareDoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareDoctorServiceApplication.class, args);
	}

}
