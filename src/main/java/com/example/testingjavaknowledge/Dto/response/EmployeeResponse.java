package com.example.testingjavaknowledge.Dto.response;

import lombok.Data;

@Data
public class EmployeeResponse {
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;

    public EmployeeResponse(String firstName, String lastName, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
