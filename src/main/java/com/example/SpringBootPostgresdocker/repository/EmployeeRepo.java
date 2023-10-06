package com.example.SpringBootPostgresdocker.repository;

import com.example.SpringBootPostgresdocker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
