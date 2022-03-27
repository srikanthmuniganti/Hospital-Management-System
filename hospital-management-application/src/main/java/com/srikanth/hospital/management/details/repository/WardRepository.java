package com.srikanth.hospital.management.details.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srikanth.hospital.management.details.entity.Ward;

@Repository
public interface WardRepository extends JpaRepository<Ward, Integer> {

	@Query(value = "update set :beds=:count where type=:ward_name",nativeQuery = true)
	void updateWardDetails(String ward_name, String beds, int count);

	List<Ward> findByHospitalId(String hospitalId);

	Ward findByHospitalIdAndWardId(String hospitalId, String wardId);

	@Query(value = "update set total_beds=:count where wardId=:wardId and hospitalId=:hospitalId",nativeQuery = true)
	void updateTotalBeds(String hospitalId, String wardId, int count);
	
	@Query(value = "update set total_beds=:count where wardId=:wardId and hospitalId=:hospitalId",nativeQuery = true)
	void updateAvailableBeds(String hospitalId, String wardId, int count);

}
