package com.ibm.emp_mangmnt.mapper;

import com.ibm.emp_mangmnt.entity.Department;
import com.ibm.emp_mangmnt.entity.Employee;
import com.ibm.emp_mangmnt.model.DepartmentDTO;
import com.ibm.emp_mangmnt.model.EmployeeDTO;

import java.util.List;

public class DepartmentMapper {

    public static DepartmentDTO toDTO(Department department) {
        if (department == null) {
            return null;
        }

        DepartmentDTO dto = toDTOWithoutEmployees(department);
        if (department.getEmployees() != null) {
            dto.setEmployees(department.getEmployees().stream()
                    .map(EmployeeMapper::toDTOWithoutDepartment)
                    .toList());
        }
        return dto;
    }

    public static Department toEntity(DepartmentDTO dto) {
        if (dto == null) {
            return null;
        }

        Department department = toEntityWithoutEmployees(dto);
        if (dto.getEmployees() != null) {
            List<Employee> employees = dto.getEmployees().stream()
                    .map(EmployeeMapper::toEntityWithoutDepartment)
                    .toList();
            employees.forEach(employee -> employee.setDepartment(department));
            department.setEmployees(employees);
        }
        return department;
    }

    static DepartmentDTO toDTOWithoutEmployees(Department department) {
        if (department == null) {
            return null;
        }

        DepartmentDTO dto = new DepartmentDTO();
        dto.setDepartmentId(department.getDepartmentId());
        dto.setDepartmentName(department.getDepartmentName());
        dto.setDescription(department.getDescription());
        return dto;
    }

    static Department toEntityWithoutEmployees(DepartmentDTO dto) {
        if (dto == null) {
            return null;
        }

        Department department = new Department();
        department.setDepartmentId(dto.getDepartmentId());
        department.setDepartmentName(dto.getDepartmentName());
        department.setDescription(dto.getDescription());
        return department;
    }
}
