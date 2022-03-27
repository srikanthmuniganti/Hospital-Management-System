package com.srikanth.hospital.management.system.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PatientRegistrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientRegistrationApiApplication.class, args);
	}
}
