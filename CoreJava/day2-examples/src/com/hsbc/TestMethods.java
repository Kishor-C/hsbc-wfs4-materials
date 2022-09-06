package com.hsbc;

import java.util.Scanner;

public class TestMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String user = scan.next();
		String result = sayHi(user);
		System.out.println(result);
		//accept age as input and call the sayHi to print name & age both
		System.out.println("Enter age");
		int age = scan.nextInt();
		result = sayHi(user, age);
		System.out.println(result);
		scan.close();
	}
	
	public static String sayHi(String name) {
		return "Hi "+name;
	}
	// method overloading
	public static String sayHi(String name, int age) {
		//return "Hi ".concat(name).concat(", Your age is "+age);
		return "HI "+name+", Your age is "+age;
	}

}
