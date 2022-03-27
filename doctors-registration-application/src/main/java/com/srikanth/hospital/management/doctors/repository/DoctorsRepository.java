package com.srikanth.hospital.management.doctors.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srikanth.hospital.management.doctors.entity.Doctor;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctor, String> {

	List<Doctor> findBySpeciality(String speciality);

	//Doctor findByFirstNameAndLastName(String first_name, String last_name);

	Doctor findByFullName(String name);

	@Modifying
	@Transactional
	@Query(value = "update doctor set noOfAssignedCases= :noOfAssignedCases where doctorid= :doctorId", nativeQuery = true)
	void updateAssignedCases(String doctorId, int noOfAssignedCases);

}
