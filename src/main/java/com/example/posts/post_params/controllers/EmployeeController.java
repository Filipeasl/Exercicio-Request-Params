package com.example.posts.post_params.controllers;

import com.example.posts.post_params.models.Employee;
import com.example.posts.post_params.respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees(
            @RequestParam Optional<String> firstName,
            @RequestParam Optional<String> department,
            @RequestParam Optional<BigDecimal> minSalary,
            @RequestParam Optional<LocalDate> hiredAfter,
            @RequestParam Optional<LocalDate> hiredBefore,
            @RequestParam Optional<Boolean> active) {

        // Lógica de filtragem pode ser adicionada aqui

        return employeeRepository.findAll();  // Por enquanto, retornando todos os empregados
    }
}