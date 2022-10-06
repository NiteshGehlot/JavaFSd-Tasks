package com.star.restemsexception.service;

import java.util.List;

import com.star.restemsexception.beans.Employee;
import com.star.restemsexception.exceptions.UserNotFound;

public interface IEmployeeService {
	
		public List<Employee> getAllEmployees();
	    public Employee createEmployee(Employee employees);

	    public Employee getEmployeeById(int id) throws UserNotFound;
	    public Employee updateEmployee(Employee employeeDetails);
	    public void deleteEmployeeById(int id);

}
