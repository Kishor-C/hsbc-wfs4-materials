package com.hsbc.exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String error) {
		super(error);
	}
}
