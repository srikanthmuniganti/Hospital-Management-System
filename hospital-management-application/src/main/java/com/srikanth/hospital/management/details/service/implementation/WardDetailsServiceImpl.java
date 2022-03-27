package com.srikanth.hospital.management.details.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.hospital.management.details.entity.Ward;
import com.srikanth.hospital.management.details.exceptions.HospitalNotFoundException;
import com.srikanth.hospital.management.details.repository.HospitalDetailsRepository;
import com.srikanth.hospital.management.details.repository.WardRepository;
import com.srikanth.hospital.management.details.service.WardDetailsService;

@Service
public class WardDetailsServiceImpl implements WardDetailsService {
	
	@Autowired
	WardRepository wardRepository;
	
	@Autowired
	HospitalDetailsRepository  hospitalDetailsRepository;

	@Override
	public void addWardDetailsToHospital(List<Ward> wards) throws HospitalNotFoundException {
			if(hospitalDetailsRepository.findById(wards.get(0).getHospitalId()).isPresent())
			{
				wardRepository.saveAll(wards);
			}
			else {
				throw new HospitalNotFoundException("No Hospital found with the given Hospital ID, please check...");
			}
	}

	@Override
	public List<Ward> getAllWardsByHospital(String hospitalId) {
		return wardRepository.findByHospitalId(hospitalId);
	}

	@Override
	public Ward getWardDetailsByHospital(String hospitalId,String wardId) {
		return wardRepository.findByHospitalIdAndWardId(hospitalId,wardId);
	}

	@Override
	public int getAvailableBeds(String hospitalId, String wardId) {
		return wardRepository.findByHospitalIdAndWardId(hospitalId,wardId).getAvailableBeds();
	}

	@Override
	public void updateAvailableBeds(String hospitalId, String wardId, int count) {
		wardRepository.updateAvailableBeds(hospitalId,wardId,count);
	}

	@Override
	public void updateTotalBeds(String hospitalId, String wardId, int count) {
		wardRepository.updateTotalBeds(hospitalId,wardId,count);
	}

}
