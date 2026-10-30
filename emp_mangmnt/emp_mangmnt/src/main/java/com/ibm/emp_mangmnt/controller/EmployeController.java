package com.ibm.emp_mangmnt.controller;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeService.saveEmployee(employee);
        //TODO: Implement the logic to save the employee using the employeService
        return ResponseEntity.ok(savedEmployee);
    }
    //TODO: Implement all the CRUD operations for the Employee entity (Create, Read, Update, Delete) using the employeService
}
