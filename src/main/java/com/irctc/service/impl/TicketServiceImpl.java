package com.irctc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;
import com.irctc.repository.TicketRepository;
import com.irctc.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	private TicketRepository ticketRepository;
	

	private Map<String, Ticket> ticketsMap = new HashMap<String, Ticket>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		//Passenger savedPassenger = passengerRepository.save(passenger);
		String pnr = "";
		for (int i = 0; i<=7;i++) {
			pnr= pnr+(int) (Math.random()*10);
		}
		Ticket ticket = new Ticket();
		ticket.setPnr(pnr);
		ticket.setStatus("Confimred");
		ticket.setTrainNum(passenger.getTrainNum());
		ticket.setDestination(passenger.getDestination());
		ticket.setSource(passenger.getSource());
		ticket.setJourneyDate(passenger.getJourneyDate());
		ticket.setName(passenger.getName());
		ticketRepository.save(ticket);
		ticketsMap.put(pnr, ticket);		
		return ticket;
	}
	@Override
	public Ticket getTicket(Integer ticketId) {
		Ticket gotTicket = ticketRepository.findById(ticketId).get();
		//passengerRepository.findById(pid).get();
		return gotTicket;
	}
	
	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public String deleteTicket(Integer id) {
		ticketRepository.deleteById(id);

		return "";
	}
	@Override
	public Ticket updateTicket(Passenger passenger, Integer ticketId) {
		String pnr = "";
		for (int i = 0; i<=7;i++) {
			pnr= pnr+(int) (Math.random()*10);
		}
		Ticket existingTicket = ticketRepository.findById(ticketId).get();
		existingTicket.setStatus("Confirmed");
		existingTicket.setTrainNum(passenger.getTrainNum());
		existingTicket.setPnr(pnr);
		existingTicket.setTicketId(ticketId);
		existingTicket.setDestination(passenger.getDestination());
		existingTicket.setSource(passenger.getSource());
		ticketRepository.save(existingTicket);
		return existingTicket;
	}

}

