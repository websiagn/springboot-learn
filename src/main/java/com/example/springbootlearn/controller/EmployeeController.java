package com.example.springbootlearn.controller;

import com.example.springbootlearn.beans.Employee;
import com.example.springbootlearn.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") int id) {
        return employeeMapper.getEmpById(id);
    }

    @PostMapping("/emp")
    public void insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
    }
}
