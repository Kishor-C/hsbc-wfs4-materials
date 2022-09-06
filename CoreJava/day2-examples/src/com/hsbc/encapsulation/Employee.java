package com.hsbc.encapsulation;

public class Employee {
	private int id;
	private String name;
	private long phone;
	
	public Employee(int id, String name, long phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	// setters must have void and take an argument and assign value to the property
	// getters must return the property and doesn't take argument
	// create setters for for name & phone, getters for id, name & phone

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	
}
