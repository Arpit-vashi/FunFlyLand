package org.pgs.backedfunflyland.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class VoucherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private double discount;
    private Integer validForNumberOfCustomers;
    private Integer validForNumberOfDays; // Added property
    private Date validUntil;

    // Constructors
    public VoucherModel() {
    }

    public VoucherModel(String code, double discount, Integer validForNumberOfCustomers, Integer validForNumberOfDays, Date validUntil) {
        this.code = code;
        this.discount = discount;
        this.validForNumberOfCustomers = validForNumberOfCustomers;
        this.validForNumberOfDays = validForNumberOfDays;
        this.validUntil = validUntil;
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

    public Integer getValidForNumberOfCustomers() {
        return validForNumberOfCustomers;
    }

    public void setValidForNumberOfCustomers(Integer validForNumberOfCustomers) {
        this.validForNumberOfCustomers = validForNumberOfCustomers;
    }

    public Integer getValidForNumberOfDays() {
        return validForNumberOfDays;
    }

    public void setValidForNumberOfDays(Integer validForNumberOfDays) {
        this.validForNumberOfDays = validForNumberOfDays;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
