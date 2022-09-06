package com.hsbc.ui;

import java.util.Scanner;

import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.utility.ObjectFactory;

public class ViewController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the storage 1: Array 2: Others");
		int input = scan.nextInt();
		UserDao dao = ObjectFactory.getInstance(input);
		int options = 0;
		do {
			System.out.println("1: Store 2: Find All 3: Find User 4: Exit");
			options = scan.nextInt();
			switch(options) {
			case 1: 
				System.out.println("Enter id, name and phone separated by space");
				User user = new User(scan.nextInt(), scan.next(), scan.nextLong());
				dao.save(user);
				System.out.println("________User Saved_____");
				break;
			case 2: 
				User[] users = dao.findAll();
				for(User item : users) {
					System.out.println(item);
					System.out.println("______________________________");
				}
				break;
			case 3: 
				System.out.println("Enter id to search");
				int id = scan.nextInt();
				User u = dao.findUser(id);
				if(u != null) 
					System.out.println(u); // Object.toString()
				else
					System.err.println("User with an id "+id+" not found");
				break;
			}
		} while(options != 3);
		scan.close();
	}
}
