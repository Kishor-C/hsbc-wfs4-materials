package com.hsbc.model.beans;

public class Address {
	private String state;
	private String city;
	private int pin;
	private int emp_ref;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + ", emp_ref=" + emp_ref + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getEmp_ref() {
		return emp_ref;
	}
	public void setEmp_ref(int emp_ref) {
		this.emp_ref = emp_ref;
	}
	
	
}
