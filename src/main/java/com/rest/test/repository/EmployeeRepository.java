package com.rest.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rest.test.model.Employee;
@Component
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
		
		
}
