package com.hsbc.exceptions;

import java.sql.SQLException;

public class TestExceptions {
	public static void main(String[] args) {
		System.out.println("________main starts__________");
		try {
			int r = div(20, 10);
			System.out.println("Result = "+r);
			r = save(-1);
			System.out.println("Result = "+r);
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("________________________");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally { System.out.println("____Finally Block____"); }
		System.out.println("________main ends____________");
	}
	public static int save(int x) throws SQLException {
		if(x < 0) {throw new SQLException();}
		else if (x == 0) {throw new SQLException("Insufficient balance "+x);}
		else {return 1;}
	}
	public static int div(int a, int b) throws ArithmeticException {
		if(b == 0) {throw new ArithmeticException();
		} else { return a / b;}
	}
}
