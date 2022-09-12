package com.hsbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.apache.derby.jdbc.ClientDriver;

public class TestSelect {

	public static void main(String[] args) {
		try {
			Class.forName(ClientDriver.class.getName());
			// Class.forName("org.apache.derby.jdbc.ClientDriver")
			Connection connection = 
			 DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
			Statement statement = connection.createStatement();
			ResultSet result = 
					statement.executeQuery("select * from employee where id = 200");
			while(result.next()) {
				int empId = result.getInt("ID"); // converts sql int to java int
				String empName = result.getString("NAME");
				LocalDate empDob = result.getDate("DOB").toLocalDate();
				System.out.println("EmpId = "+empId);
				System.out.println("EmpName = "+empName);
				System.out.println("EmpDob = "+empDob);
				System.out.println("____________________");
			}
			result.close();
			statement.close();
			connection.close();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
