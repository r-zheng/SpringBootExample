package com.Genspark.SpringBootExample.Service;

import com.Genspark.SpringBootExample.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee getEmployeeById(int employeeId);

    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    boolean deleteEmployee(int employeeId);
}
