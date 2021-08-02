package com.app.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.model.Employee;
import com.app.spring.srvice.EmployeeService;
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeservice;

@PostMapping("/create")
public List<Employee> saveemployee(@RequestBody Employee employee){
	return employeeservice.saveemployee(employee);
}
}
