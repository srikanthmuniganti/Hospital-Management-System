package com.srikanth.hospital.management.system.patient.service;

import com.srikanth.hospital.management.system.patient.entity.Patient;

public interface PatientRegistrationService {

	public Patient getPatientDetails(String patientId);

	public String registerNewPatient(Patient patient);

	public String dischargePatient(String patientId, long amount);
	
}
