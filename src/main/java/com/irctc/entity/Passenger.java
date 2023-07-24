package com.irctc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="IRCTC_PASSENGERS")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "passenger_id")
	private Integer pid;
	
	@Column(name = "passenger_name")
	private String name;
	
	@Column(name = "passenger_journeyDate")
	private String journeyDate;
	
	@Column(name = "train_number")
	private Integer trainNum;;
	
	@Column(name = "train_source")
	private String source;
	
	@Column(name = "train_destination")
	private String destination;
}


