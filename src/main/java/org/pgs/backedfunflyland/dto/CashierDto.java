package org.pgs.backedfunflyland.dto;

import java.util.Date;

public class CashierDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String mobileNumber;
    private double salary;
    private Date joiningDate;

    // Constructors
    public CashierDto() {}

    public CashierDto(Long id, String username, String password, String email, String mobileNumber, double salary, Date joiningDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
