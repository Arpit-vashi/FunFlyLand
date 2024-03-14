package org.pgs.backedfunflyland.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class TicketTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String ticketSpeed;
    private boolean promotion;

    // Constructors
    public TicketTypeModel() {}

    public TicketTypeModel(String name, double price, String ticketSpeed, boolean isPromotion) {
        this.name = name;
        this.price = price;
        this.ticketSpeed = ticketSpeed;
        this.promotion = isPromotion;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTicketSpeed() {
        return ticketSpeed;
    }

    public void setTicketSpeed(String ticketSpeed) {
        this.ticketSpeed = ticketSpeed;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
}
