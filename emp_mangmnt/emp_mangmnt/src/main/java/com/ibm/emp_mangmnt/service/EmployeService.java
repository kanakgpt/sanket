package com.ibm.emp_mangmnt.service;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.model.EmployeeDTO;

public interface EmployeService {
    EmployeeDTO saveEmployee(EmployeeDTO employee);

    EmployeeDTO getEmployeeById(Long id);
}
