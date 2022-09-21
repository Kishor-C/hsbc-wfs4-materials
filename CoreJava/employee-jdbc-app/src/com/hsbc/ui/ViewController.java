package com.hsbc.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.hsbc.exceptions.EmployeeCreationException;
import com.hsbc.factory.ObjectFactory;
import com.hsbc.model.beans.Employee;
import com.hsbc.model.dao.EmployeeDao;

public class ViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the storage 1: Database 2: Others");
		int input = scan.nextInt();
		EmployeeDao dao = ObjectFactory.getEmployeeDao(input);
		int options = 0;
		do {
			System.out.println("1: Store 2: Find All 3: Find Employee 4: Exit");
			options = scan.nextInt();
			switch(options) {
			case 1: 
				Employee employee = new Employee();
				System.out.println("Enter Name:-");
				employee.setName(scan.next());
				System.out.println("Enter Dob in yyyy-MM-dd format:-");
				employee.setDob(LocalDate.parse(scan.next()));
				try { 
					int status = dao.save(employee);
					if(status > 0) {
						System.out.println("_____Employee Created_____");
					} else {
						System.err.println("___Employee not created due to some reason____");
					}
				} catch(EmployeeCreationException e) {
					System.err.println(e);
				}
				break;
			case 2: 
				List<Employee> list = dao.fetchEmployees();
				for(Employee emp : list) {
					System.out.println(emp);
					if(emp.getAddress() != null) {
						System.out.println(emp.getAddress());
					}
					System.out.println("____________________________________");
				}
				break;
			case 3: 
				
				
				break;
			}
		} while(options != 4);
		scan.close();
	}

}
