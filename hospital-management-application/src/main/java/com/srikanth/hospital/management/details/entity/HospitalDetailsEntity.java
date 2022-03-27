package com.srikanth.hospital.management.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class HospitalDetailsEntity {

	@Id
	@Column(nullable = false)
	private String hospitalId;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false)
	private String ceo;
	
//	@OneToMany(mappedBy = "hospitalDetailsEntity")
//	private List<Ward> wards;
	
}
