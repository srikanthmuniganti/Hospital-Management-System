package com.srikanth.hospital.management.system.patient.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.srikanth.hospital.management.system.patient.model.Doctor;


@FeignClient(name = "DOCTORS-REGISTRATION-APLICATION/doctors-registration-aplication/doctor") // name refers to name of service registered with eureka
public interface DoctorDetailsClient {

	@GetMapping("/get-by-Id/{doctorId}")
	public Doctor getDoctorDetails(@PathVariable int doctorId);
	
	@GetMapping("/get-by-name/{name}")
	public Doctor getDoctorDetailsByName(@PathVariable String name);
	
	@PutMapping("/updateAssignedCases/{doctorId}/{type}")
	public String updateAssignedCases(@PathVariable String doctorId, @PathVariable String type);
}
