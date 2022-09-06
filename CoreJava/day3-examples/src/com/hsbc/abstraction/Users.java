package com.hsbc.abstraction;

public class Users implements Guest, Admin {

	@Override
	public void modify() {
		System.out.println("_____Users modify()_____");
	}

	@Override
	public void book() {
		System.out.println("______Users book()_____");
	}
}
