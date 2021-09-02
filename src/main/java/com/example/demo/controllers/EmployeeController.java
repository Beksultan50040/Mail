package com.example.demo.controllers;

import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public EmployeeDto save(@RequestBody EmployeeDto employeeDto){
        return employeeService.save(employeeDto);
    }

    @PutMapping("/update")
    public EmployeeDto update(@RequestBody EmployeeDto employeeDto){
        return employeeService.update(employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeDto findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @GetMapping("/findAll")
    public List<EmployeeDto> findAll(){
        return employeeService.findAll();
    }
}
