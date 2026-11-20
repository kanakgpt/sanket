package com.ibm.emp_mangmnt.controller;

import com.ibm.emp_mangmnt.model.EmployeeDTO;
import com.ibm.emp_mangmnt.response.APIResponse;
import com.ibm.emp_mangmnt.service.EmployeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

    @Autowired
    private EmployeService employeService;
//CRUD

    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<APIResponse<EmployeeDTO>> saveEmployee(@RequestBody @Valid EmployeeDTO employee) {
        EmployeeDTO savedEmployee = employeService.saveEmployee(employee);

        return ResponseEntity.ok(APIResponse.success("Employee saved successfully", savedEmployee));
    }
    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<EmployeeDTO>> getEmployeeById(@PathVariable Long id) {
        EmployeeDTO employee = employeService.getEmployeeById(id);
        return ResponseEntity.ok(APIResponse.success("Employee retrieved successfully", employee));
    }

    //TODO: Implement all the CRUD operations for the Employee entity (Create, Read, Update, Delete) using the employeService
//update the employee
// Delete the employee
// get all employees
}
