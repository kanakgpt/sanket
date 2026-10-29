package com.ibm.emp_mangmnt.service.impl;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.repository.EmployeRepo;
import com.ibm.emp_mangmnt.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeRepo employeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {

        return employeRepo.save(employee);
    }
}
