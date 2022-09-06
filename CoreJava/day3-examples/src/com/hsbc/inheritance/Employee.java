package com.hsbc.inheritance;

public class Employee extends Person {
	private int id;
	private double salary;
	public Employee(int id, String name, String gender, double salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;
		System.out.println("_____Employee(4args)_____");
	}
	@Override
	public void display() {
		System.out.println("_______Employee display()_________");
		System.out.println("Id = "+id+", Name = "+getName()
			+", Salary = "+salary+", Gender = "+getGender());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
