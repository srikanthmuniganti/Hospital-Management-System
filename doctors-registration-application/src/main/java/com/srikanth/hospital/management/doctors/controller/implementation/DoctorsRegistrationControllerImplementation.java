package com.srikanth.hospital.management.doctors.controller.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.hospital.management.doctors.controller.DoctorsRegistrationController;
import com.srikanth.hospital.management.doctors.entity.Doctor;
import com.srikanth.hospital.management.doctors.service.DoctorsRegistrationService;

@RestController
@RequestMapping("/doctor")
public class DoctorsRegistrationControllerImplementation  implements DoctorsRegistrationController{

	@Autowired
	DoctorsRegistrationService doctorsRegistrationService;
	
	@Override
	public List<Doctor> getListOfAllDoctors() {
		return doctorsRegistrationService.getListOfAllDoctors();
	}

	@Override
	public Doctor getDoctorDetails(String doctorId) {
		return doctorsRegistrationService.getDoctorDetails(doctorId);
	}

	@Override
	public List<Doctor> getDoctorsBySpeciality(String speciality) {
		return doctorsRegistrationService.getDoctorsBySpeciality(speciality);
	}

	@Override
	public String registerNewDoctor(Doctor doctor) {
		doctorsRegistrationService.registerNewDoctor(doctor);
		return "Registration Successfull!";
	}

	@Override
	public Doctor getDoctorDetailsByName(String name) {
		return 	doctorsRegistrationService.getDoctorDetailsByName(name);
	}

	@Override
	public String updateAssignedCases(String doctorId, String type) {
		return doctorsRegistrationService.updateAssignedCases(doctorId,type);
	}
	

}
