package com.srikanth.hospital.management.system.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.srikanth.hospital.management.system.patient.entity.Patient;

public interface PatientRegistrationController {
	
	@GetMapping("/")
	public default String testMethod() {
		return "working";
	}
	@GetMapping("/{patientId}")
	public Patient getPatientDetails(@PathVariable("patientId") String patientId);
	
	@PostMapping("/register/{docterName}")
	public String registerNewPatient(@RequestBody Patient patient,@PathVariable String docterName);
	
	@PutMapping("/discharge/{patientId}/{amount}")
	public String dischargePatient(@PathVariable("patientId") String patientId,@PathVariable long amount);	
	
}
