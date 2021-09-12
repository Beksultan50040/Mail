package com.example.demo.controllers;

import com.example.demo.feign.ClientFeign;
import com.example.demo.models.dto.ClientDto;
import com.example.demo.models.dto.MailDto;
import com.example.demo.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @Autowired
    Environment env;

    @Autowired
    ClientFeign clientFeign;

    @GetMapping("/healthCheck")
    public String healthCheck() {



        return "It's  Working port: " + env.getProperty("local.server.port");
    }

    @PostMapping("/save")
    public MailDto save(@RequestBody MailDto mailDto){
        return employeeService.save(mailDto);
    }

    @PutMapping("/update")
    public MailDto update(@RequestBody MailDto mailDto){
        return employeeService.update(mailDto);
    }

    @GetMapping("/{id}")
    public MailDto findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @GetMapping("/findAll")
    public List<MailDto> findAll(){
        return employeeService.findAll();
    }

    @PostMapping("/check/openFeign/client")
    public ClientDto check(@RequestBody ClientDto clientDto){
        return clientFeign.saveClient(clientDto);
    }
}
