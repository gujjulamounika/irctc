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
@Table(name="IRCTC_TICKETS")

public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer ticketId;
		
	@Column(name = "ticket_pnr")
	private String pnr;
	
	@Column(name = "ticket_status")
	private String status;
	
	@Column(name = "train_number")
	private Integer trainNum;
	
	@Column(name = "passenger_name")
	private String name;
	
	@Column(name = "passenger_journeyDate")
	private String JourneyDate;
	
	@Column(name = "train_source")
	private String source;
	
	@Column(name = "train_destination")
	private String destination;
}

