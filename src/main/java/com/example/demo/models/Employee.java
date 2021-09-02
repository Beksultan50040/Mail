package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="Last name cannot be null")
    @Size(min = 2, max =16, message = "last name must be not less than two characters")
    private String lastName;

    @NotNull(message="First name cannot be null")
    @Size(min = 2, max =16, message = "first name must be not less than two characters")
    private String firstName;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    @NotNull(message="Last name cannot be null")
    @Size(min = 2, message = "department must be not less than two characters")
    private String department;

    @NotNull(message="Status cannot be null")
    private String status;




}
