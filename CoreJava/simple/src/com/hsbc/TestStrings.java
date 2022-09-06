package com.hsbc;

import java.util.Scanner;

public class TestStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:-");
		String text = scan.next();
		scan.close();
		char ch = text.toLowerCase().charAt(0);
		boolean isVowel = false;
		switch(ch) {
		case 'a': isVowel = true;
			break;
		case 'e': isVowel = true;
			break;
		case 'i':isVowel = true;
			break;
		case 'o': isVowel = true;
			break;
		case 'u': isVowel = true;
			break;
		default: 
			System.out.println(ch+" is not a vowel");
		}
		if(isVowel) {
			System.out.println(ch+" is a vowel");
		}
	}

}
