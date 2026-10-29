package com.ibm.emp_mangmnt.repository;

import com.ibm.emp_mangmnt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeRepo extends JpaRepository<Employee, Long> {
}
