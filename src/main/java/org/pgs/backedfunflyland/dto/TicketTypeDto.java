package org.pgs.backedfunflyland.dto;

public class TicketTypeDto {
    private Long id;
    private String ticketTypeName;
    private double ticketTypePrice;
    private String ticketSpeed;
    private boolean promotion;

    // Constructors
    public TicketTypeDto() {}

    public TicketTypeDto(Long id, String ticketTypeName, double ticketTypePrice, String ticketSpeed, boolean isPromotion) {
        this.id = id;
        this.ticketTypeName = ticketTypeName;
        this.ticketTypePrice = ticketTypePrice;
        this.ticketSpeed = ticketSpeed;
        this.promotion = promotion;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketTypeName() {
        return ticketTypeName;
    }

    public void setTicketTypeName(String ticketTypeName) {
        this.ticketTypeName = ticketTypeName;
    }

    public double getTicketTypePrice() {
        return ticketTypePrice;
    }

    public void setTicketTypePrice(double ticketTypePrice) {
        this.ticketTypePrice = ticketTypePrice;
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
        promotion = promotion;
    }
}
