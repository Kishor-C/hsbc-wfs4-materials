package com.hsbc;

import java.util.Scanner;

public class TestScannerConditions {
	public static void main(String[] args) {
		// Scanner needs to be closed at the end
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		double marks = scan.nextDouble();
		scan.close();
		if ( marks >= 70 ) {
			System.out.println("FCD");
		}
		else if ( marks >= 60 && marks < 70 ) {
			System.out.println("FC");
		} 
		else if ( marks >= 50 && marks < 60 ) {
			System.out.println("SC");
		}
		else if ( marks >= 40 && marks < 50 ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
	}

}
