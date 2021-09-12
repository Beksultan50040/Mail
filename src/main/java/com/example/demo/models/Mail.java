package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Employees")
@Data
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="name cannot be null")
    private String name;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;


    @NotNull(message="Status cannot be null")
    private String status;




}
