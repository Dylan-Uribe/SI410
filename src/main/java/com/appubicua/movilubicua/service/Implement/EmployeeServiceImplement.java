package com.appubicua.movilubicua.service.Implement;

import com.appubicua.movilubicua.dto.EmployeeDto;
import com.appubicua.movilubicua.entity.Employee;
import com.appubicua.movilubicua.mapper.EmployeeMapper;
import com.appubicua.movilubicua.repository.EmployeeRepository;
import com.appubicua.movilubicua.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEmployee(employeeDto);
        return EmployeeMapper.toEmployeeDto(employeeRepository.save(employee));
    }
}
