package com.srikanth.hospital.management.doctors.service;

import java.util.List;

import com.srikanth.hospital.management.doctors.entity.Doctor;

public interface DoctorsRegistrationService {

	List<Doctor> getListOfAllDoctors();

	Doctor getDoctorDetails(String doctorId);

	List<Doctor> getDoctorsBySpeciality(String speciality);

	void registerNewDoctor(Doctor doctor);

	Doctor getDoctorDetailsByName(String name);

	String updateAssignedCases(String doctorId, String type);

}
