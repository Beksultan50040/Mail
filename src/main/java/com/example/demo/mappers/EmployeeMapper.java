package com.example.demo.mappers;


import com.example.demo.models.Employee;
import com.example.demo.models.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee toEntity(EmployeeDto employeeDto);
    EmployeeDto toDto(Employee employee);

    List<EmployeeDto> toDtos(List<Employee> employeeList);
}
