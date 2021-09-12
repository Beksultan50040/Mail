package com.example.demo.services.impl;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.mappers.EmployeeMapper;
import com.example.demo.models.Mail;
import com.example.demo.models.dto.MailDto;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public MailDto save(MailDto mailDto) {
        Mail mail = EmployeeMapper.INSTANCE.toEntity(mailDto);
        mail.setStatus("In process");
        mail = employeeRepo.save(mail);
        return EmployeeMapper.INSTANCE.toDto(mail);
    }

    @Override
    public MailDto update(MailDto mailDto) {

        Mail mail = EmployeeMapper.INSTANCE.toEntity(mailDto);
        mail = employeeRepo.saveAndFlush(mail);
        return EmployeeMapper.INSTANCE.toDto(mail);
    }

    @Override
    public MailDto findById(Long id) {

        Mail mail = employeeRepo.findById(id).get();

        return EmployeeMapper.INSTANCE.toDto(mail);
    }

    @Override
    public List<MailDto> findAll() {

        return EmployeeMapper.INSTANCE.toDtos(employeeRepo.findAll());
    }
}
