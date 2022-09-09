package com.hsbc;

import java.time.LocalDate;

public class Student {
	private int rollNo;
	private String name;
	private LocalDate birthday; // date will be stored in yyyy-MM-dd
	public Student(int rollNo, String name, LocalDate birthday) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.birthday = birthday;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", birthday=" + birthday + "]";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
}
