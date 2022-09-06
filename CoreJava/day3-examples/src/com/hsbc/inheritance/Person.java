package com.hsbc.inheritance;

public class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("______Person(2args)______");
	}
	public void display() {
		System.out.println("_______Person display()________");
		System.out.println("Name = "+name+", Gender = "+gender);
	}
	// generate setters & getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
