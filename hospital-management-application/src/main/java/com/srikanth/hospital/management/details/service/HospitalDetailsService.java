package com.srikanth.hospital.management.details.service;

import com.srikanth.hospital.management.details.entity.HospitalDetailsEntity;

public interface HospitalDetailsService {

	HospitalDetailsEntity getHospitalDetails(String hospitalId);

	String registerHospital(HospitalDetailsEntity hospitalEntity);

	HospitalDetailsEntity getHospitalDetailsByName(String name);

}
