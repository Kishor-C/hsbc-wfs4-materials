package com.hsbc.inheritance;

public class Student extends Person {
	private int rollNo;
	private String grade;
	
	public Student(int rollNo, String name, String gender, String grade) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
		System.out.println("______Student(4args)______");
	}

	@Override
	public void display() {
		System.out.println("_____Student display()_____");
		System.out.println("RollNo = "+rollNo+", Name = "+getName()
			+", Gender = "+getGender()+", Grade = "+grade);
	}
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
