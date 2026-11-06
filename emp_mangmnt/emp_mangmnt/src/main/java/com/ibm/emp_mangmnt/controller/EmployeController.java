package com.ibm.emp_mangmnt.controller;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.model.EmployeeDTO;
import com.ibm.emp_mangmnt.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

    @Autowired
    private EmployeService employeService;
//CRUD

    @PostMapping("/save")
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employee) {
        EmployeeDTO savedEmployee = employeService.saveEmployee(employee);

        return ResponseEntity.ok(savedEmployee);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
        EmployeeDTO employee = employeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    //TODO: Implement all the CRUD operations for the Employee entity (Create, Read, Update, Delete) using the employeService
//update the employee
// Delete the employee
// get all employees
}
