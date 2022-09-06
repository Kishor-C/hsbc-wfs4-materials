package com.hsbc;

public class QuizDemo {

	public static void main(String[] args) {
		int i = 10;
		m1(i++);
		System.out.println(i);
	}
	
	public static void m1(int i) {
		i++;
	}

}
