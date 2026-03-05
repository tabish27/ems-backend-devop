package com.javalearning.ems.controller;

import com.javalearning.ems.dto.EmployeeDto;
import com.javalearning.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto){

        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);

    }

    //Build Get Employee REST API
    @PostMapping("login")
    public ResponseEntity<String> employeeLogin(@RequestParam Long employeeId,
                                                @RequestParam String password){
        return ResponseEntity.ok(employeeService.employeeLogin(employeeId, password));
    }


    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable("id") Long employeeId){
        return ResponseEntity.ok(employeeService.getEmployeeById(employeeId));
    }

    //Build Get All Employee REST API
    @GetMapping
    public ResponseEntity<String> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    //Build Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updatedEmployee){

        return ResponseEntity.ok(employeeService.updateEmployee(employeeId, updatedEmployee));
    }

    //Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable("id") Long employeeId){

        employeeService.deleteEmployee(employeeId);

        return ResponseEntity.ok("employee deleted successfully");
    }

}
