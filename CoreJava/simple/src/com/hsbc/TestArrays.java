package com.hsbc;

import java.util.Scanner;

public class TestArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size for an array:-");
		int size = scan.nextInt();
		int[] items = new int[size]; 
		for(int index = 0; index < size; index++) {
			System.out.println("Enter value to: items["+index+"]"); 
			items[index] = scan.nextInt();
		}
		scan.close();
		System.out.println("_______Array Iteration_______");
		for(int index = 0; index < size; index++) {
			System.out.println(items[index]);
		}
		// find the minimum number in the items, enter combination of +ve & -ve values
		System.out.println("______Minimum number in items________");
		// find the sum of numbers in the items, enter combination of +ve & -ve values
		System.out.println("________Sum of number in items_________");
	}

}
