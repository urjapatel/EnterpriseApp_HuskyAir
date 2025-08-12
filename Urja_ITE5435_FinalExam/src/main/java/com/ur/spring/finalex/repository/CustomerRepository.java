package com.ur.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ur.spring.finalex.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}