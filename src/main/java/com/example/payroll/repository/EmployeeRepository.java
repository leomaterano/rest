package com.example.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
