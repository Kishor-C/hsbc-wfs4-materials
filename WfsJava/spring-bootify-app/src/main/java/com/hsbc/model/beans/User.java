package com.hsbc.model.beans;

public class User {
	private int userId;
	private String name;
	private int phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, int phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
