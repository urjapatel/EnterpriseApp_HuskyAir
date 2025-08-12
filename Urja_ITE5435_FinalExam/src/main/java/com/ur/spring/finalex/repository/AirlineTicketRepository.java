package com.ur.spring.finalex.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ur.spring.finalex.model.AirlineTicket;

public interface AirlineTicketRepository extends MongoRepository<AirlineTicket, String> {
	Optional<AirlineTicket> findByReservationId(String reservationId);
}