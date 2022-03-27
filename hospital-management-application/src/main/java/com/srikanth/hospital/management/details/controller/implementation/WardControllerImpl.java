package com.srikanth.hospital.management.details.controller.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.hospital.management.details.controller.WardController;
import com.srikanth.hospital.management.details.entity.Ward;
import com.srikanth.hospital.management.details.exceptions.HospitalNotFoundException;
import com.srikanth.hospital.management.details.service.WardDetailsService;

@RestController
@RequestMapping("/ward")
public class WardControllerImpl implements WardController {

	@Autowired
	WardDetailsService wardDetailsService;
	
	@Override
	public ResponseEntity<?> addWardDetailsToHospital(List<Ward> wards) throws HospitalNotFoundException {
		wardDetailsService.addWardDetailsToHospital(wards);		
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getAllWardsByHospital(String hospitalId) {
		return new ResponseEntity<>(wardDetailsService.getAllWardsByHospital(hospitalId),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Ward> getWardDetailsByHospital(String hospitalId, String wardId) {
		return new ResponseEntity<Ward>(wardDetailsService.getWardDetailsByHospital(hospitalId,wardId),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Integer> getAvailableBeds(String hospitalId, String wardId) {
		return new ResponseEntity<Integer>(wardDetailsService.getAvailableBeds(hospitalId, wardId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateAvailableBeds(String hospitalId, String wardId, int count) {
		wardDetailsService.updateAvailableBeds(hospitalId, wardId, count);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> updateTotalBeds(String hospitalId, String wardId, int count) {
		wardDetailsService.updateTotalBeds(hospitalId, wardId, count);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
