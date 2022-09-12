package com.hsbc.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {

	// Default constructor for default message
	public EmployeeNotFoundException() {
		super();
	}
	// Constructor that creates exception with custom error
	// message
	public EmployeeNotFoundException(String arg0) {
		super(arg0);
	}
	// Constructor that wraps the exception
	public EmployeeNotFoundException(Throwable arg0) {
		super(arg0);	
	}
	
}
