package com.hsbc.model.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.ClientDriver;
// Utility class to connect to the DB
public class DbUtility {
	// method establishes Database connection
	public static Connection establishConnection() 
			throws ClassNotFoundException, SQLException {
		Class.forName(ClientDriver.class.getName());
		return DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
	}
}
