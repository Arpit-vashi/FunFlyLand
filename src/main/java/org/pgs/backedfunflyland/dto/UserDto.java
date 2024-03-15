package org.pgs.backedfunflyland.dto;

public class UserDto {
    private Long id;
    private String username;
    private String password;
    private double salary;
    private String email;
    private String mobileNumber;
    private String role;

    public UserDto() {}

    public UserDto(Long id, String username, String password, double salary, String email, String mobileNumber, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.role = role;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
