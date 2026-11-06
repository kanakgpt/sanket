package com.ibm.emp_mangmnt.mapper;

import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.model.EmployeeDTO;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee employee) {
        if (employee == null) {
            return null;
        }
        EmployeeDTO dto = new EmployeeDTO();
        dto.setName(employee.getName());
        dto.setAge(employee.getAge());
        dto.setDepartment(employee.getDepartment());
        return dto;
    }
    public static Employee toEntity(EmployeeDTO dto) {
        if (dto == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setAge(dto.getAge());
        employee.setDepartment(dto.getDepartment());
        return employee;
    }
}
