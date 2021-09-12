package com.example.demo.services;

import com.example.demo.models.dto.MailDto;

import java.util.List;

public interface EmployeeService {

    MailDto save(MailDto mailDto);
    MailDto update(MailDto mailDto);
    MailDto findById(Long id);
    List<MailDto> findAll();
}
