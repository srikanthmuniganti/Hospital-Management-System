package com.srikanth.hospital.management.doctors.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.srikanth.hospital.management.doctors.models.HospitalDetailsEntity;

@FeignClient("HOSPITAL-DETAILS-APPLICATION/hospital-details-application/hospital")
public interface HospitalManagementSystem {
	
	@GetMapping("/get-hospital-details/{hospitalId}")
	public HospitalDetailsEntity getHospitalDetails(@PathVariable String hospitalId);
	
	@GetMapping("/get-hospital-details-by-name/{name}")
	public HospitalDetailsEntity getHospitalDetailsByName(@PathVariable String name);
	
}
