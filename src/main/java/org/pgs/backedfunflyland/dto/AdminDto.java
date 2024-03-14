package org.pgs.backedfunflyland.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminDto {
    @JsonProperty("id") // Rename the property in JSON to 'id'
    private Long id;
    private String username;
    private String password;

    // Constructors
    public AdminDto() {
    }

    public AdminDto(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    @JsonProperty("id") // Ensure 'id' property is serialized and deserialized correctly
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
}
