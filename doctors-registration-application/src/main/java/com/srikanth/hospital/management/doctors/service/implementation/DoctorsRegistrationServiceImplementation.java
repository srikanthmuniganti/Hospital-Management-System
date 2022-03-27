package com.srikanth.hospital.management.doctors.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.hospital.management.doctors.entity.Doctor;
import com.srikanth.hospital.management.doctors.feign.clients.HospitalManagementSystem;
import com.srikanth.hospital.management.doctors.repository.DoctorsRepository;
import com.srikanth.hospital.management.doctors.service.DoctorsRegistrationService;

@Service
public class DoctorsRegistrationServiceImplementation implements DoctorsRegistrationService {

	@Autowired
	DoctorsRepository doctorsRepository;
	
	@Autowired
	HospitalManagementSystem  hospitalManagementSystem;
	
	@Override
	public List<Doctor> getListOfAllDoctors() {
		return doctorsRepository.findAll();
	}

	@Override
	public Doctor getDoctorDetails(String doctorId) {
		return doctorsRepository.findById(doctorId).get();
	}

	@Override
	public List<Doctor> getDoctorsBySpeciality(String speciality) {
		return doctorsRepository.findBySpeciality(speciality);
	}

	@Override
	public void registerNewDoctor(Doctor doctor) {
		doctor.setHospitalId(hospitalManagementSystem.getHospitalDetailsByName(doctor.getHospitalId()).getHospitalId());
		doctorsRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorDetailsByName(String name) {
		//String[] names=name.split("\s");
		//return doctorsRepository.findByFirstNameAndLastName(names[0],names[1]);
		return doctorsRepository.findByFullName(name);
	}

	@Override
	public String updateAssignedCases(String doctorId, String type) {
		Doctor doctor=doctorsRepository.findById(doctorId).get();
		if(type.equalsIgnoreCase("INCREASE"))
		{
			doctor.setNoOfAssignedCases(doctor.getNoOfAssignedCases()+1);
		}
		else {
			doctor.setNoOfAssignedCases(doctor.getNoOfAssignedCases()-1);
		}
		doctorsRepository.updateAssignedCases(doctorId,doctor.getNoOfAssignedCases());
		return "updated Assigned Cases";
	}

}
