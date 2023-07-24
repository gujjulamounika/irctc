package com.irctc.service;

import java.util.List;

import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;

public interface TicketService {
Ticket bookTicket(Passenger passenger);
	
	List<Ticket> getAllTickets();
	
	Ticket getTicket(Integer ticketId);
	
	String deleteTicket(Integer id);
	
	Ticket updateTicket(Passenger passenger, Integer ticketId);
}


