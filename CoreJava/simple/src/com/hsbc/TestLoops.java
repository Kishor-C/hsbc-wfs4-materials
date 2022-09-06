package com.hsbc;

public class TestLoops {
	public static void main(String[] args) {
		System.out.println("___________For Loop____________");
		for(int i = 1; i <= 3; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("__________While Loop____________");
		int counter = 1;
		while (counter % 5 != 0) {
			System.out.println("counter = "+counter);
			counter++;
		}
		System.out.println("_________Do While Loop___________");
		int anotherCounter = 1;
		do {
			System.out.println("another counter = "+anotherCounter);
			anotherCounter++;
		} while(anotherCounter % 5 == 0);
	}
}
