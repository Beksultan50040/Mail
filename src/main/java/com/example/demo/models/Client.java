package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senderName;
    private String receiverName;
}