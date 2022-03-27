package com.srikanth.hospital.management.details.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.hospital.management.details.controller.HospitalDetailsController;
import com.srikanth.hospital.management.details.entity.HospitalDetailsEntity;
import com.srikanth.hospital.management.details.service.HospitalDetailsService;

@RestController
@RequestMapping("/hospital")
public class HospitalDetailsControllerImplementation implements HospitalDetailsController{

	@Autowired
	HospitalDetailsService hospitalDetailsService;
	@Override
	public HospitalDetailsEntity getHospitalDetails(String hospitalId) {
		return hospitalDetailsService.getHospitalDetails(hospitalId);
	}

	@Override
	public String registerHospital(HospitalDetailsEntity hospitalEntity) {
		return hospitalDetailsService.registerHospital(hospitalEntity);
	}

	@Override
	public HospitalDetailsEntity getHospitalDetailsByName(String name) {
		return hospitalDetailsService.getHospitalDetailsByName(name);
	}

}
