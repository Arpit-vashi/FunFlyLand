package org.pgs.backedfunflyland.dto;

public class VoucherDto {
    private Long id;
    private String code;
    private double discount;
    private int validForNumberOfCustomers;
    private int validForNumberOfDays;

    // Constructors
    public VoucherDto() {
    }

    public VoucherDto(Long id, String code, double discount, int validForNumberOfCustomers, int validForNumberOfDays) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.validForNumberOfCustomers = validForNumberOfCustomers;
        this.validForNumberOfDays = validForNumberOfDays;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getValidForNumberOfCustomers() {
        return validForNumberOfCustomers;
    }

    public void setValidForNumberOfCustomers(int validForNumberOfCustomers) {
        this.validForNumberOfCustomers = validForNumberOfCustomers;
    }

    public int getValidForNumberOfDays() {
        return validForNumberOfDays;
    }

    public void setValidForNumberOfDays(int validForNumberOfDays) {
        this.validForNumberOfDays = validForNumberOfDays;
    }
}
