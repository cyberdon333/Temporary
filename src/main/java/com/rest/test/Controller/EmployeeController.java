package com.rest.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.test.model.Employee;
import com.rest.test.serviceimpl.EmployeeServiceImlp;

@RestController

public class EmployeeController {
	
		@Autowired	
		EmployeeServiceImlp employeeServiceImlp;
		
		@GetMapping("/val/map")
		public String  test()
		{
			return "dsagar";
			
		}
	
	//	@RequestMapping(value = "/val/add", headers = {
     //   "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
		@PutMapping("/val/add")
		public ResponseEntity<Employee> createEmployee(@RequestBody Employee e)
		{
			System.out.println("inside create"+e);
			return new ResponseEntity<Employee>(employeeServiceImlp.saveEmployee(e),HttpStatus.ACCEPTED) ;			
			
		}
		@PostMapping("/val/temp")
		public String  createEmployee3(@RequestBody String e)
		{
			System.out.println("inside create"+e);
			return e;			
			
		}
		@PutMapping
		public String  updateEmployee(@RequestBody String e)
		{
			System.out.println("inside create"+e);
			return e;			
			
		}
		@DeleteMapping
		public String  deleteEmployee(@RequestBody String e)
		{
			System.out.println("inside create"+e);
			return e;			
			
		}
}
