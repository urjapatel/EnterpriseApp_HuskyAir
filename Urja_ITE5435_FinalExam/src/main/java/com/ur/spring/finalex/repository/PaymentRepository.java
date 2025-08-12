package com.ur.spring.finalex.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ur.spring.finalex.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
	Optional<Payment> findByReservationId(String reservationId);
}