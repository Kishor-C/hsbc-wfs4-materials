package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exceptions.EmployeeCreationException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.beans.Employee;
import com.hsbc.model.dao.util.DbUtility;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	// save method receives name and dob, id will be auto-generated
	@Override
	public int save(Employee employee) throws EmployeeCreationException {
		// return 1 if save is success else generate exception
		int status = 0;
		try { 
			// establish connection
			Connection connection = DbUtility.establishConnection();
			// query to dynamically add name & dob
			String query = "insert into employee values(next value for emp_seq, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, employee.getName());
			statement.setDate(2, Date.valueOf(employee.getDob()));
			status = statement.executeUpdate();
			statement.close();
			connection.close(); // close this in finally block
		} catch(ClassNotFoundException e) {
			throw new EmployeeCreationException(e);
		} catch(SQLException e) {
			throw new EmployeeCreationException(e);
		}
		return status;
	}

	// converts all the employee records to List<Employee>
	@Override
	public List<Employee> fetchEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection connection = DbUtility.establishConnection();
			String query = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			// loop and navigate over each record, on each record create employee object
			// each object add to the list
			while(result.next()) {
				Employee employee = new Employee();
				employee.setId(result.getInt("ID")); // initializes id of employee
				employee.setName(result.getString("NAME")); // initializes name of employee
				employee.setDob(result.getDate("DOB").toLocalDate()); // initializes dob
				list.add(employee);
			}
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) { 
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException {
		return null;
	}

}
