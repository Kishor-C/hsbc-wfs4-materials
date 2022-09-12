package com.hsbc.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import org.apache.derby.jdbc.ClientDriver;

public class TestInsert {

	public static void main(String[] args) {
		try { 
			Class.forName(ClientDriver.class.getName());
			// Class.forName("org.apache.derby.jdbc.ClientDriver")
			Connection connection = 
			 DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
			// disabling auto-commit
			connection.setAutoCommit(false);
			
			String query = "insert into employee values(next value for emp_seq, ?, ?)";
			PreparedStatement prepared = connection.prepareStatement(query);
			Scanner scan = new Scanner(System.in);
			
			for(int i = 1; i <= 5; i++) {
				System.out.println("Enter name");
				prepared.setString(1, scan.next()); // 1 -> maps -> 1st ? -> 2nd column
				System.out.println("Enter dob yyyy-MM-dd: ");
				LocalDate dob = LocalDate.parse(scan.next());
				prepared.setDate(2, Date.valueOf(dob));
				
				int rows = prepared.executeUpdate();
				System.out.println("Rows updated: "+rows);
				// rollback if some problem occurs
				if(i == 3) connection.rollback();
			}
			// commit if no problem
			connection.commit();
			scan.close();	prepared.close();	connection.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
