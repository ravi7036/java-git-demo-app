package com.demo.service;

import com.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void createEmployee(Employee emp);

    Employee deleteEmployee(long id);

    Optional<Employee> getEmployee(long id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(long id, Employee employee);
}
