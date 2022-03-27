package com.srikanth.hospital.management.system.patient.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.hospital.management.system.patient.entity.Patient;
import com.srikanth.hospital.management.system.patient.feign.clients.DoctorDetailsClient;
import com.srikanth.hospital.management.system.patient.feign.clients.HospitalManagementSystem;
import com.srikanth.hospital.management.system.patient.repository.PatientsRepository;
import com.srikanth.hospital.management.system.patient.service.PatientRegistrationService;
import com.srikanth.hospital.management.system.patient.util.DateConverter;

@Service
public class PatienRegistrationServiceImplementation implements PatientRegistrationService {

	@Autowired
	PatientsRepository patientsRepository;
	
	@Autowired
	DoctorDetailsClient doctorDetailsClient;
	
	@Autowired
	HospitalManagementSystem hospitalManagementSystem;
	
	@Override
	public Patient getPatientDetails(String patientId) {
		return patientsRepository.findById(patientId).get();
	}

	@Override
	public String registerNewPatient(Patient patient) {

		doctorDetailsClient.updateAssignedCases(patient.getDoctorId(), "INCREASE");
		patient.setHospitalId(hospitalManagementSystem.getHospitalDetailsByName(patient.getHospitalId()).getHospitalId());
		patientsRepository.save(patient);
		return "Registration Successfull!";
	}

	@Override
	public String dischargePatient(String patientId, long amount) {		
		
		doctorDetailsClient.updateAssignedCases((patientsRepository.findById(patientId).get()).getDoctorId() , "DECREASE");
		patientsRepository.dischargePatient(patientId,amount,DateConverter.convertDate());
		return "successfull!";
	}

}
