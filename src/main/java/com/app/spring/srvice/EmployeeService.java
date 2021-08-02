package com.app.spring.srvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.spring.Repository.EmployeeRepository;
import com.app.spring.model.Employee;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository repo;

public List<Employee> saveemployee(Employee employee) {
	// TODO Auto-generated method stub
	return (List<Employee>) repo.save(employee);
}

}
