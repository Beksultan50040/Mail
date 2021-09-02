package com.example.demo.services.impl;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.mappers.EmployeeMapper;
import com.example.demo.models.Employee;
import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDto);
        employee.setStatus("In process");
        employee = employeeRepo.save(employee);
        return EmployeeMapper.INSTANCE.toDto(employee);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDto);
        employee = employeeRepo.saveAndFlush(employee);
        return EmployeeMapper.INSTANCE.toDto(employee);
    }

    @Override
    public EmployeeDto findById(Long id) {

        Employee employee = employeeRepo.findById(id).get();

        return EmployeeMapper.INSTANCE.toDto(employee);
    }

    @Override
    public List<EmployeeDto> findAll() {

        return EmployeeMapper.INSTANCE.toDtos(employeeRepo.findAll());
    }
}
