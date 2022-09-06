package com.hsbc.inheritance;

public class TestPolymorphism {

	public static void main(String[] args) {
		Person p1 = new Person("Raj", "Male");
		Employee e1 = new Employee(111, "Vijay", "Male", 35222);
		Student s1 = new Student(888, "Jenni", "Female", "A");
		
		System.out.println("_________Resolving display at runtime_________________");
//		print(p1);
//		print(e1);
//		print(s1);
		System.out.println("_________Accessing Subtype members__________________");
		acceptSubTypes(p1);
		acceptSubTypes(e1);
		acceptSubTypes(s1);
	}
	
	public static void acceptSubTypes(Person p) { // Person p = p11 = new Person(..)
		if(p instanceof Employee) {
			Employee emp = (Employee)p; 
			emp.setSalary(50000);
			print(emp);
		}
		if(p instanceof Student) {
			Student std = (Student)p;
			std.setGrade("A+");
			print(std);
		}	
	}
	
	public static void print(Person p) {
		p.display(); // poly-morphic
		System.out.println("_____________________________");
	}

}
