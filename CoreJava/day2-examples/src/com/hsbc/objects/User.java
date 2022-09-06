package com.hsbc.objects;

public class User {
	String name;
	int age;
	long phone;
	static int counter = 0;
	User() {
		name = "Guest";	
		age = 18;
		counter++;
		System.out.println("_______Default Constructor_____");
	}
	User(String name) {
		this();
		this.name = name;
		System.out.println("_______User(String name)_______");
	}
	User(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("______User(String name, int age)_____");
	}
	User(String name, int age, long phone) {
		this(name, age);
		this.phone = phone;
		System.out.println("________User(String name, int age, long phone)_______");
	}
	void printInformation() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone = "+phone);
		System.out.println("User count = "+counter);
	}
}
