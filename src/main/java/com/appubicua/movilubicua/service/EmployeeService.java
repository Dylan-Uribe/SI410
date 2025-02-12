package com.appubicua.movilubicua.service;

import com.appubicua.movilubicua.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    /*List<EmployeeDto> findAll();
    EmployeeDto findById(Long id);
    EmployeeDto update(EmployeeDto employeeDto, long Id);
    void delete(Long id);*/
}