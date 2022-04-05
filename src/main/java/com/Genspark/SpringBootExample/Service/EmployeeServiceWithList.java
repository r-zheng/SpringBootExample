package com.Genspark.SpringBootExample.Service;

import com.Genspark.SpringBootExample.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceWithList implements EmployeeService {

    List<Employee> employees;

    public EmployeeServiceWithList() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe"));
        employees.add(new Employee(2, "Jack Daniels"));
        employees.add(new Employee(3, "Josh Dave"));
    }

    public Employee getEmployeeById(int employeeId) {
        for(Employee employee : employees) {
            if(employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employees.get(employees.size() - 1);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        for(Employee e : employees) {
            if(e.getId() == employee.getId()) {
                e.setName(employee.getName());
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        for(Employee employee : employees) {
            if(employee.getId() == employeeId) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }
}
