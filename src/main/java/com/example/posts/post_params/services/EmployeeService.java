package com.example.posts.post_params.services;

import com.example.posts.post_params.models.Employee;
import com.example.posts.post_params.respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getFilteredEmployees() {
        // Adicione aqui a lógica de negócios para filtrar empregados
        return employeeRepository.findAll();
    }
}