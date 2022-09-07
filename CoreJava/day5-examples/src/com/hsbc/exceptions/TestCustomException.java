package com.hsbc.exceptions;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("____Welcome to ATM please enter amount___");
		double amount = scan.nextDouble();
		try {
			double balance = debit(amount);
			System.out.println("Balance is: "+balance);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		scan.close();
	}
	public static double debit(double amount) throws InsufficientBalanceException {
		double balance = 50000.0;
		if(amount > balance) {
			throw new InsufficientBalanceException(
					"Balance is: "+balance+", entered amount is: "+amount);
		} else {
			balance = balance - amount;
			System.out.println("_____Amount debited_____");
		}
		return balance;
	}

}
