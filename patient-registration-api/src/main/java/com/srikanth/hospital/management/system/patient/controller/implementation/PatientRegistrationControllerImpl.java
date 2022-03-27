package com.srikanth.hospital.management.system.patient.controller.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.hospital.management.system.patient.controller.PatientRegistrationController;
import com.srikanth.hospital.management.system.patient.entity.Patient;
import com.srikanth.hospital.management.system.patient.feign.clients.DoctorDetailsClient;
import com.srikanth.hospital.management.system.patient.model.Doctor;
import com.srikanth.hospital.management.system.patient.service.PatientRegistrationService;

@RestController
@RequestMapping("/patient")
public class PatientRegistrationControllerImpl implements PatientRegistrationController {
	
	@Autowired
	PatientRegistrationService patientRegistrationService;   	

	@Autowired
	DoctorDetailsClient doctorDetailsClient;

	@Override
	public Patient getPatientDetails(String patientId) {
		return patientRegistrationService.getPatientDetails(patientId);
	}

	@Override
	public String registerNewPatient(Patient patient,String docterName) {
		Doctor doctor=doctorDetailsClient.getDoctorDetailsByName(docterName);
		patient.setDoctorId(doctor.getDoctorId());
		return patientRegistrationService.registerNewPatient(patient);
	}

	@Override
	public String dischargePatient(String patientId,long amount) {
		return patientRegistrationService.dischargePatient(patientId,amount);
	}

}
