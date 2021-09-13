package com.example.demo.models.dto;

import com.example.demo.models.Client;
import lombok.Data;

@Data
public class MailDto {


    private Long id;

    private String name;
    private String status;
    private ClientDto client;
}
