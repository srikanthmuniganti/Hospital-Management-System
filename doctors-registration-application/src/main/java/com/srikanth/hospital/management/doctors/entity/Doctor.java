package com.srikanth.hospital.management.doctors.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Doctor {
	
	@Id
	private String doctorId;
	private String hospitalId;
	private String fullName;
	private String speciality;
	private String mobileNumber;
	private double salary;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate joiningDate;
	private int noOfAssignedCases;
}
