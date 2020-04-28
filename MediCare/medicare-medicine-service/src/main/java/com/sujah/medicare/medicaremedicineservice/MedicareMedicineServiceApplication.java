package com.sujah.medicare.medicaremedicineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.medicine")
@EnableEurekaClient
public class MedicareMedicineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareMedicineServiceApplication.class, args);
	}

}
