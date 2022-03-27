package com.srikanth.hospital.management.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srikanth.hospital.management.details.entity.HospitalDetailsEntity;

@Repository
public interface HospitalDetailsRepository extends JpaRepository<HospitalDetailsEntity, String> {

	HospitalDetailsEntity findByName(String name);

}
