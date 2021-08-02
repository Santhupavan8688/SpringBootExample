package com.app.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.spring.model.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	

}
