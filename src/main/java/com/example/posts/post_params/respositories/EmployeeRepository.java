package com.example.posts.post_params.respositories;
import com.example.posts.post_params.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}