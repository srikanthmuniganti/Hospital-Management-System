package com.srikanth.hospital.management.details.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.srikanth.hospital.management.details.entity.Ward;
import com.srikanth.hospital.management.details.exceptions.HospitalNotFoundException;

public interface WardController {

	@PostMapping("/addWardDetailsToHospital")
	public ResponseEntity<?> addWardDetailsToHospital(@RequestBody List<Ward> wards) throws HospitalNotFoundException;
	
	@GetMapping("/getAllWardsByHospital/{hospitalId}")
	public ResponseEntity<?> getAllWardsByHospital(@PathVariable String hospitalId);
	
	@GetMapping("/getWardDetailsByHospital/{hospitalId}/{wardId}")
	public ResponseEntity<Ward> getWardDetailsByHospital(@PathVariable String hospitalId, @PathVariable String wardId);
	
	@GetMapping("/getAvailableBeds/{hospitalId}/{wardId}")
	public ResponseEntity<Integer> getAvailableBeds(@PathVariable String hospitalId, @PathVariable String wardId);
	
	@PutMapping("/updateAvailableBeds/{hospitalId}/{wardId}")
	public ResponseEntity<?> updateAvailableBeds(@PathVariable String hospitalId, @PathVariable String wardId,int count);
	
	@PutMapping("/updateTotalBeds/{hospitalId}/{wardId}")
	public ResponseEntity<?> updateTotalBeds(@PathVariable String hospitalId, @PathVariable String wardId,int count);
	
}
