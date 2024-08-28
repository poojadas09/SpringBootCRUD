package com.example.crud.controller;

import com.example.crud.exception.ResourceNotFoundException;
import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee){
        Employee updateemployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
        updateemployee.setFirstName(employee.getFirstName());
        updateemployee.setLastName(employee.getLastName());
        employeeRepository.save(updateemployee);
        return ResponseEntity.ok(updateemployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:"+id));
        employeeRepository.delete(employee);
        return ResponseEntity.ok(employee);
    }
}
