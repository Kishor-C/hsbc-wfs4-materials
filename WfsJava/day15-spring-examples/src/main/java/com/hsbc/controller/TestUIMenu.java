package com.hsbc.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

public class TestUIMenu {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("context.xml");
		UserService service = (UserService)ctx.getBean("userServiceImpl");
		
		Scanner scan = new Scanner(System.in);
		// we will have a menu to continuously to show CRUD operations
		// until you exit
		int option = 0;
		do {
			System.out.println("1: Store 2: Fetch All 3: Fetch By Id "
					+ "4: Delete by Id 5: Update Phone by Id "
					+ "-1: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1: break;
			// call the fetchAllUsers() & through forEach print users
			case 2: 
				List<User> list = service.fetchUsers();
				list.forEach(item -> System.out.println(item));
				System.out.println("------------------------");
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			}
		} while(option != -1);
	}

}
