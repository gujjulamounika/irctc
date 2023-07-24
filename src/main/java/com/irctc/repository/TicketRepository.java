package com.irctc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.entity.Ticket;

public interface TicketRepository  extends JpaRepository<Ticket, Serializable>{



}
