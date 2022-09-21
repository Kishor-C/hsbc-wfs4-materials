package com.hsbc.controller;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

public class TestController {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("context.xml");
		UserService service = (UserService)ctx.getBean("userServiceImpl");
		
		Scanner scan = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter unique id:-");
		user.setUserId(scan.nextInt());
		System.out.println("Enter username:-");
		user.setName(scan.next());
		System.out.println("Enter phone:-");
		user.setPhone(scan.nextInt());
		
		service.save(user);
		System.out.println("___DONE___");
		
	}
}
