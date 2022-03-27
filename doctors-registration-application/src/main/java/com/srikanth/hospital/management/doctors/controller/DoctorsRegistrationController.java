package com.srikanth.hospital.management.doctors.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.srikanth.hospital.management.doctors.entity.Doctor;

public interface DoctorsRegistrationController {

	@GetMapping("/get-all-doctors-list")
	public List<Doctor> getListOfAllDoctors();
	
	@GetMapping("/get-by-Id/{doctorId}")
	public Doctor getDoctorDetails(@PathVariable String doctorId);
	
	@GetMapping("/get-by-name/{name}")
	public Doctor getDoctorDetailsByName(@PathVariable String name);		
	
	@GetMapping("/get-by-speciality/{speciality}")
	public List<Doctor> getDoctorsBySpeciality(@PathVariable String speciality);
		
	@PostMapping("/register")
	public String registerNewDoctor(@RequestBody Doctor doctor);
	
	@PutMapping("/updateAssignedCases/{doctorId}/{type}")
	public String updateAssignedCases(@PathVariable String doctorId,@PathVariable String type);
	
}
