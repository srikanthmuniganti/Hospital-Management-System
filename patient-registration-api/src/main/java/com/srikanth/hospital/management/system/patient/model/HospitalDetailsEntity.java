package com.srikanth.hospital.management.system.patient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HospitalDetailsEntity {

	private String hospitalId;
	private String name;
	private String ceo;
}