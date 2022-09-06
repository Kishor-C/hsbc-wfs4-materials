package com.hsbc;

public class TestDataOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c = a % b;
		System.out.println("c = "+c);
		int d = b++;
		int e = --a;
		System.out.println("b = "+b+", d = "+d); // b = 9, d = 8
		System.out.println("a = "+a+", e = "+e); // a = 4, e = 4
		
	}

}
