package com.example.demo.models.dto;

import lombok.Data;

@Data
public class EmployeeDto {


    private Long id;

    private String lastName;
    private String firstName;
    private String email;
    private String department;
    private String status;
}
