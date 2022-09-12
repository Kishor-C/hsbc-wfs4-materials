package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exceptions.EmployeeCreationException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.beans.Employee;

// Interface for the client to call the declared methods
public interface EmployeeDao {
	public int save(Employee employee) throws EmployeeCreationException;
	public List<Employee> fetchEmployees();
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException;
}
