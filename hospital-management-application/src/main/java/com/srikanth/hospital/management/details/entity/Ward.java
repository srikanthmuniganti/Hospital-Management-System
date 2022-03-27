package com.srikanth.hospital.management.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Ward {
	
	@Id
	@Column(nullable = false)
	private String wardId;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private int totalBeds;
	@Column(nullable = false)
	private int availableBeds;
	@Column(nullable = false)
	private int unavailableBeds;
	@Column(nullable = false)
	private String hospitalId;
	
	
//	@ManyToOne
//	@JoinColumn(name = "hospital_id")
//	private HospitalDetailsEntity hospitalDetailsEntity;

}
