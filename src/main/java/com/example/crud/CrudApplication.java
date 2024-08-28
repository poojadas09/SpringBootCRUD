package com.example.crud;

import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setEmailId("john.smith@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee.setFirstName("John1");
        employee.setLastName("Smith1");
        employee.setEmailId("john.smith@gmail.com1");
        employeeRepository.save(employee1);

    }
}
