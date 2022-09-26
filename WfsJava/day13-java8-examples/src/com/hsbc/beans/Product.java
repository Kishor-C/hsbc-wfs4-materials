package com.hsbc.beans;

public class Product {
	private int id;
	private String name;
	private double price;
	private double ratings;
	// generate 2 constructors, toString, setters & getters
	public Product() {
		super();
	}
	public Product(int id, String name, double price, double ratings) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
}