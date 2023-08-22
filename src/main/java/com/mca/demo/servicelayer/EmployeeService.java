package com.mca.demo.servicelayer;

import com.mca.demo.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee>getAllEmployees();
}
