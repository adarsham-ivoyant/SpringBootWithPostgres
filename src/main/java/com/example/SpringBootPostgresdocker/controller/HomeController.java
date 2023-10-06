package com.example.SpringBootPostgresdocker.controller;

import com.example.SpringBootPostgresdocker.entity.Employee;
import com.example.SpringBootPostgresdocker.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("Home")
    public String myFunc(){
        return "WelCome to Employee Management";
    }

    @PostMapping("addEmp")
    public String addEmp(Employee employee){
        employeeRepo.save(employee);
        return "User Registerd Successfully";
    }

    @GetMapping("/getById/{empId}")
    public Employee getDetails(@PathVariable("empId") int empId){
        return employeeRepo.findById(empId).get();
    }

    @DeleteMapping("/deleteById/{empId}")
    public String delete(@PathVariable("empId") int empId){
        employeeRepo.deleteById(empId);
        return "deleted Successfully";
    }
   

    @GetMapping("viewAll")
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

}
