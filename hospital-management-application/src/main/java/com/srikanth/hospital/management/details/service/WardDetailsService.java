package com.srikanth.hospital.management.details.service;

import java.util.List;

import com.srikanth.hospital.management.details.entity.Ward;
import com.srikanth.hospital.management.details.exceptions.HospitalNotFoundException;

public interface WardDetailsService {
	
	public void addWardDetailsToHospital(List<Ward> wards) throws HospitalNotFoundException;
	
	public List<Ward> getAllWardsByHospital(String hospitalId);
	
	public Ward getWardDetailsByHospital(String hospitalId, String wardId);
	
	public int getAvailableBeds(String hospitalId, String wardId);
	
	public void updateAvailableBeds(String hospitalId,String wardId,int count);
	
	public void updateTotalBeds(String hospitalId,String wardId,int count);
	
}
