package com.appubicua.movilubicua.service;

import com.appubicua.movilubicua.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    EmployeeDto findById(Long id);
    List<EmployeeDto> findAll();
    void delete(Long id);
    /* EmployeeDto update(EmployeeDto employeeDto, long Id);*/
}