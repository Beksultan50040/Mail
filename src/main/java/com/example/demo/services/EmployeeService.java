package com.example.demo.services;

import com.example.demo.models.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto save(EmployeeDto employeeDto);
    EmployeeDto update(EmployeeDto employeeDto);
    EmployeeDto findById(Long id);
    List<EmployeeDto> findAll();
}
