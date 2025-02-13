package com.appubicua.movilubicua.mapper;

import com.appubicua.movilubicua.dto.EmployeeDto;
import com.appubicua.movilubicua.entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {
    public static EmployeeDto toEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee toEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

    public static List<EmployeeDto> toEmployeeDtoList(List<Employee> employees) {
        return employees.stream()
                .map(EmployeeMapper::toEmployeeDto)
                .collect(Collectors.toList());
    }
}