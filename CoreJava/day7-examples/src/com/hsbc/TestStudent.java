package com.hsbc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestStudent {
	public static void main(String[] args) {
		System.out.println("___________Creating LocalDate__________");
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.parse("1999-10-25"); // format it understands is yyyy-MM-dd
		System.out.println(today);
		System.out.println(dob);
		// if you want different format to enter then you can use that format & mention in DateTimeFormatter
		LocalDate dob2 = LocalDate.parse("25-10-1999", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(dob2);
		System.out.println("______Passing LocalDate to Student___________");
		Student st1 = new Student(101, "Vinay", LocalDate.parse("20-10-1990", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(st1);
		// what if LocalDate needs to be printed in custom format then you can use format(DateTimeFormatter)
		System.out.println("DOB = "+dob.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
		String s1 = "helloworld";
		String s2 = "hello".concat("world");
		System.out.println("s1  = "+s1 +", s2 = " +s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}
}
