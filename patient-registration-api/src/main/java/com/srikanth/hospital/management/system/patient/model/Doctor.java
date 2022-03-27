package com.srikanth.hospital.management.system.patient.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	private String doctorId;
	private String hospitalId;
	private String firstName;
	private String lastName;
	private String speciality;
	private String mobileNumber;
	private double salary;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate joiningDate;
	private int noOfAssignedCases;
}
