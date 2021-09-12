package com.example.demo.mappers;


import com.example.demo.models.Mail;
import com.example.demo.models.dto.MailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Mail toEntity(MailDto mailDto);
    MailDto toDto(Mail mail);

    List<MailDto> toDtos(List<Mail> mailList);
}
