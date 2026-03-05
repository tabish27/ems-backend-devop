package com.javalearning.ems.service.impl;

import com.javalearning.ems.dto.EmployeeDto;
import com.javalearning.ems.entity.Employee;
import com.javalearning.ems.exception.ResourceNotFoundException;
import com.javalearning.ems.mapper.EmployeeMapper;
import com.javalearning.ems.repository.EmployeeRepository;
import com.javalearning.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

//    private EmployeeRepository employeeRepository;

    @Override
    public String createEmployee(EmployeeDto employeeDto) {

        return "Employee Created";

    }

    @Override
    public String getEmployeeById(Long employeeId) {

        return "Employee recieved by id : " + employeeId;


    }

    @Override
    public String getAllEmployees() {

        return "Recieved allemployees";

    }

    @Override
    public String updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {

        return "Employee Updated";

    }

    @Override
    public void deleteEmployee(Long employeeId) {

//        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
//                () -> new ResourceNotFoundException("Employee with given id does not exist : " + employeeId)
//        );
//
//        employeeRepository.deleteById(employeeId);

    }

}
