package com.hsbc.objects;

public class TestConstructors {
	public static void main(String[] args) {
		User user1 = new User("A", 22, 9023930399L);
		User user2 = new User("B", 28);
		User user3 = new User("C");
		user1.printInformation();
		System.out.println("__________________");
		user2.printInformation();
		System.out.println("__________________");
		user3.printInformation();
	}
}
