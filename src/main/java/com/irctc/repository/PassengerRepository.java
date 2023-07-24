package com.irctc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Serializable>{

	}

