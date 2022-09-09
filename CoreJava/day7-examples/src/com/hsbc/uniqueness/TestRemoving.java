package com.hsbc.uniqueness;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestRemoving {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		for(int i = 1; i <= 5; i++) {
			numbers.add(i);
		}
		printNumbers(numbers);
		int item = 2;
		Iterator<Integer> iterator = numbers.iterator();
		// hasNext(), next(), remove()
		while(iterator.hasNext()) {
			int x = iterator.next();
			System.out.println("x = "+x);
			if(x == item) {
				iterator.remove();	
			}
		}
		printNumbers(numbers);	
	}
	public static void printNumbers(Set<Integer> set) {
		for(int x : set) {
			System.out.println(x);
		}
		System.out.println("__________________________");
	}
}
