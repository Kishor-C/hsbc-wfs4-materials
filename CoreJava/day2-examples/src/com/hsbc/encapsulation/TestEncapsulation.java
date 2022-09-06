package com.hsbc.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "Alex", 9399392093L);
		Employee emp2 = new Employee(222, "Bruce", 7771132093L);
		
		print(emp1);
		print(emp2);
		emp1.setName("Alexandar");
		print(emp1);
		
	}
	
	public static void print(Employee emp) {
		System.out.println("Id = "+emp.getId()+
					", Name = "+emp.getName()+", Phone = "+emp.getPhone());
		System.out.println("______________***__________***_______________");
	}
}
