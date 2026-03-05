package com.javalearning.ems.service;

import com.javalearning.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    String createEmployee(EmployeeDto employeeDto);

    String getEmployeeById(Long employeeId);

    String getAllEmployees();

    String updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

    String employeeLogin(Long employeeId, String password);
}
