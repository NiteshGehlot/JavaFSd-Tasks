package com.star.restemsexception.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.restemsexception.beans.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee,Integer> {

}
