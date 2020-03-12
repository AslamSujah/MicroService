package com.sujah.medicare.medicaremedicineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sujah.medicare.common.model.medicine")
public class MedicareMedicineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareMedicineServiceApplication.class, args);
	}

}
