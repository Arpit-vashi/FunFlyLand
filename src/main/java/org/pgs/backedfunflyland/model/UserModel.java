package org.pgs.backedfunflyland.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private double salary;
    private String email;
    private String mobileNumber;
    private String role;

    public UserModel() {}

    public UserModel(Long id, String username, String password, double salary, String email, String mobileNumber, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.role = role;
    }

    // Getters and setters
    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Mobile Number
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
