package com.ur.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ur.spring.finalex.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}