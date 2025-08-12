package com.ur.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Document(collection = "airline_tickets")
public class AirlineTicket {
    @Id
    private String id;
    
    private String number;
    private String details;
    private double price;
    private String status = "PENDING"; // Added status field with default value

    @DBRef
    @JsonBackReference
    private Reservation reservation;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculatePrice(int passengers, String travelClass) {
        double basePrice = price;
        if ("Business".equalsIgnoreCase(travelClass)) {
            basePrice *= 1.5;
        } else if ("First".equalsIgnoreCase(travelClass)) {
            basePrice *= 2.0;
        }
        return basePrice * passengers;
    }
}