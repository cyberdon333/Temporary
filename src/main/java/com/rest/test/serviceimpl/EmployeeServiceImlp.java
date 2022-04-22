package com.rest.test.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.test.model.Employee;
import com.rest.test.repository.EmployeeRepository;
import com.rest.test.serviceInterface.EmployeeServiceInterface;
@Service
public class EmployeeServiceImlp implements EmployeeServiceInterface {
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("inside saveEmployee");
	return	employeeRepository.save(e);
		//employeeRepository.sa
	
	}
		
}
