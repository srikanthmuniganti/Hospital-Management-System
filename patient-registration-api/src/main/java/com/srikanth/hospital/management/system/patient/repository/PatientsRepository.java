package com.srikanth.hospital.management.system.patient.repository;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srikanth.hospital.management.system.patient.entity.Patient;


@Repository
public interface PatientsRepository extends JpaRepository<Patient, String> {

	@Transactional
	@Modifying
	@Query(value = "update patient set amount=:amount,discharged= \'YES\', dischargedDate= :discharged_date where patientId=:patientId", nativeQuery = true)
	void dischargePatient(String patientId, long amount, LocalDateTime discharged_date);

}
