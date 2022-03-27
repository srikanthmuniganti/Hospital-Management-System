package com.srikanth.hospital.management.details.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.srikanth.hospital.management.details.entity.HospitalDetailsEntity;

public interface HospitalDetailsController {

	@GetMapping("/get-hospital-details/{hospitalId}")
	public HospitalDetailsEntity getHospitalDetails(@PathVariable String hospitalId);
	
	@GetMapping("/get-hospital-details-by-name/{name}")
	public HospitalDetailsEntity getHospitalDetailsByName(@PathVariable String name);
	
	@PostMapping("/register")
	public String registerHospital(@RequestBody HospitalDetailsEntity hospitalEntity);
}
