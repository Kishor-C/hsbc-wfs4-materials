package com.hsbc.uniqueness;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;

public class TestEmployeesSorted {

	public static void main(String[] args) {
		Employee e2 = new Employee(200, "Ravi", 43520);
		Employee e3 = new Employee(300, "Vikas", 33520);
		Employee e1 = new Employee(500, "Raj", 83520);
		Employee e4 = new Employee(100, "Mohan", 33000);
		Employee e5 = new Employee(400, "Vijay", 33000);
		
		Comparator<Employee> comparatorSalary = new Comparator<Employee>() { 
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary()); //returns +ve, 0 and -ve
			}
		}; 
		/*
		 * create another comparator implementation that sorts name of the employees, pass it to TreeSet
		 * create another comparator implementation that sort id in descending order, pass it to TreeSet
		 */
		Comparator<Employee> comparatorName = new Comparator<Employee>() { 
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Set<Employee> set = new TreeSet<>(comparatorName);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		TestEmployeeSet.printEmployees(set);
	}

}
