package com.srikanth.hospital.management.details.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.hospital.management.details.entity.HospitalDetailsEntity;
import com.srikanth.hospital.management.details.repository.HospitalDetailsRepository;
import com.srikanth.hospital.management.details.repository.WardRepository;
import com.srikanth.hospital.management.details.service.HospitalDetailsService;

@Service
public class HospitalDetailsServiceImplementation implements HospitalDetailsService {

	@Autowired
	HospitalDetailsRepository hospitalDetailsRepository;
	
	@Autowired
	WardRepository wardRepository;
	
	@Override
	public HospitalDetailsEntity getHospitalDetails(String hospitalId) {
		return hospitalDetailsRepository.findById(hospitalId).get();
	}

	@Override
	public String registerHospital(HospitalDetailsEntity hospitalEntity) {
		
		hospitalDetailsRepository.save(hospitalEntity);
		return "Hospital Rgistration Succesfull!!!";
	}

	@Override
	public HospitalDetailsEntity getHospitalDetailsByName(String name) {
		return hospitalDetailsRepository.findByName(name);
	}

}
