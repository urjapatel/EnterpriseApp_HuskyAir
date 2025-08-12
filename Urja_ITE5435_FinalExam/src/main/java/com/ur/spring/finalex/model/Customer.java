package com.ur.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Document(collection = "customers")
@Data
public class Customer {
    @Id
    private String id;
    
    private String address;
    private String details;
    
    @DBRef
    @JsonBackReference
    private Reservation reservation;
}