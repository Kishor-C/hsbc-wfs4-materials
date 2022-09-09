package com.hsbc.uniqueness;

import java.util.HashSet;
import java.util.Set;

import com.hsbc.beans.Employee;

public class TestEmployeeSet {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Raj", 23520);
		Employee e2 = new Employee(200, "Vijay", 43520);
		Employee e3 = new Employee(300, "Vikas", 33520);
		Employee e4 = new Employee(100, "Vijay", 33000);
		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		printEmployees(set);
	}
	public static void printEmployees(Set<Employee> set) {
		for(Employee e : set) {
			System.out.println(e);
		}
		System.out.println("_____________________________");
	}
}
