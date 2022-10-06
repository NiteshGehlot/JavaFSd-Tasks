package com.star.restemsexception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.restemsexception.beans.Employee;
import com.star.restemsexception.dao.IEmployeeDao;
import com.star.restemsexception.exceptions.UserNotFound;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao iEmployeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return iEmployeeDao.findAll();
	}

	@Override
	public Employee createEmployee(Employee employees) {
		// TODO Auto-generated method stub
		return (Employee) iEmployeeDao.save(employees);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee;
		
		if(iEmployeeDao.findById(id).isEmpty()) {
			throw new UserNotFound("No user found");
		}else {
			employee = iEmployeeDao.findById(id).get();
		}
		
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employeeDetails) {
		// TODO Auto-generated method stub
		return (Employee) iEmployeeDao.save(employeeDetails);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		iEmployeeDao.deleteById(id);
	}

}
