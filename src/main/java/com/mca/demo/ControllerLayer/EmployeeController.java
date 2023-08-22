package com.mca.demo.ControllerLayer;

import com.mca.demo.Employee;
import com.mca.demo.servicelayer.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;
@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //create employees REST API
    @PostMapping
    public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee)
    {
       return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
    }
    @GetMapping
    public List<Employee>getEmp(){
    return employeeService.getAllEmployees();
    }
}
