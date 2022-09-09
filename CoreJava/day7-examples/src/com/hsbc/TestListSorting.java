package com.hsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.uniqueness.TestEmployeeSet;

public class TestListSorting {

	public static void main(String[] args) {
		Employee e2 = new Employee(200, "Ravi", 43520);
		Employee e3 = new Employee(300, "Vikas", 33520);
		Employee e1 = new Employee(500, "Raj", 83520);
		Employee e4 = new Employee(100, "Mohan", 33000);
		Employee e5 = new Employee(400, "Vijay", 33000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1); list.add(e2); list.add(e3); list.add(e4); list.add(e5);
		
		Comparator<Employee> comparatorSalary = new Comparator<Employee>() { 
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary()); //returns +ve, 0 and -ve
			}
		}; 
		
		Collections.sort(list, comparatorSalary);
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
