package com.hsbc;

interface X { 
	void m1();
}
class A {
	public void test1() { 
		System.out.println("test1() inside A");
	}
	public void test2() { 
		System.out.println("test2() inside A");
	}
}

public class TestMethodRef {
	public static void main(String[] args) {
		A a = new A();
		X x = a :: test1; 
		x.m1();
		x = a :: test2;
		x.m1();
	}
}
