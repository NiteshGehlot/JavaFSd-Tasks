package com.star.restemsexception.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.star.restemsexception.beans.Employee;
import com.star.restemsexception.exceptions.UserNotFound;
import com.star.restemsexception.service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService iEmployeeService;
	
	@GetMapping("/")
	public List<Employee> getAllEmployees(){
		return iEmployeeService.getAllEmployees();
	}
	
	@PostMapping(path = "/",	consumes= {"application/json"},produces = {"application/xml"})
    public Employee createEmployee(Employee employees) {
    	return iEmployeeService.createEmployee(employees);
    }

	
	@GetMapping ("/{id}")
    public ResponseEntity getEmployeeById(@PathVariable int id) throws UserNotFound {
    	return new ResponseEntity(iEmployeeService.getEmployeeById(id),HttpStatus.OK);
    }
	
	@PutMapping("/{id}")
    public Employee updateEmployee(Employee employeeDetails) {
    	return iEmployeeService.updateEmployee(employeeDetails);
    }
	
	@DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(int id) {
    	iEmployeeService.deleteEmployeeById(id);
    }

}
