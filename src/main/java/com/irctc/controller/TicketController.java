package com.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;
import com.irctc.service.TicketService;

@RestController
@RequestMapping("/irctc")

public class TicketController {
 
	@Autowired
	private TicketService ticketService;
	

	@PostMapping("/bookTicket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket bookTicket = ticketService.bookTicket(passenger);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);		
	}
	
	@GetMapping("/getTicket/{id}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("id") Integer ticketId){
		Ticket foundTicket = ticketService.getTicket(ticketId);
		return new ResponseEntity<Ticket> (foundTicket, HttpStatus.OK);
	}
	
	@GetMapping("/getAllTickets")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> allTickets = ticketService.getAllTickets();
		return new ResponseEntity<> (allTickets, HttpStatus.OK);
	}
	@DeleteMapping("/deleteTicket/{id}")
	public ResponseEntity<String> deleteTicket(@PathVariable("id")Integer id){
		ticketService.deleteTicket(id);
		return new ResponseEntity<> ("Ticket deleted successfully", HttpStatus.OK);
	}	
	
	@PutMapping("/updateTicket/{id}")
	public ResponseEntity<Ticket> updateTiccket(@RequestBody Passenger passenger, @PathVariable("id") Integer ticketId){
		Ticket updateTicket = ticketService.updateTicket(passenger, ticketId);
		return new ResponseEntity<Ticket>(updateTicket,HttpStatus.OK) ;
	}
}

