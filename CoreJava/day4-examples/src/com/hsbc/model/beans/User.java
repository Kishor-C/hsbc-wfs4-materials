package com.hsbc.model.beans;

public class User {
	private int userId;
	private String name;
	private long phone;
	public User(int userId, String name, long phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	public User() {
		super();
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + "]";
	}
}
