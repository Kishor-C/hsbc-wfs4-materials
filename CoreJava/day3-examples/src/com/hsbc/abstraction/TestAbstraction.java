package com.hsbc.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Users user = new Users();
		ui1(user);
		ui2(user);
	}
	// This code is implementing by Developer#1
	public static void ui1(Guest guest) {
		guest.book();
		System.out.println("_____________________");
	}
	// This code is implementing by Developer#2
	public static void ui2(Admin admin) {
		admin.book();
		admin.modify();
		System.out.println("____________________");
	}

}
