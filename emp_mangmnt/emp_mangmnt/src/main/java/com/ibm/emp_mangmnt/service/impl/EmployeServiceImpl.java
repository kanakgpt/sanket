package com.ibm.emp_mangmnt.service.impl;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.mapper.EmployeeMapper;
import com.ibm.emp_mangmnt.model.EmployeeDTO;
import com.ibm.emp_mangmnt.repository.EmployeRepo;
import com.ibm.emp_mangmnt.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeRepo employeRepo;
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employee) {

        return EmployeeMapper.toDTO(employeRepo.save(EmployeeMapper.toEntity(employee)));
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Employee not found with id " + id));
        return EmployeeMapper.toDTO(employee);
    }
}
