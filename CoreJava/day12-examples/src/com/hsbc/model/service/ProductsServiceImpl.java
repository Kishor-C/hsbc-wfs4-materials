package com.hsbc.model.service;

import java.util.Arrays;
import java.util.List;

import com.hsbc.model.beans.Product;

public class ProductsServiceImpl {
	private List<Product> products = Arrays.asList(
			new Product(1111, "Laptop", 45000),
			new Product(2111, "Mobile", 25000),
			new Product(3111, "Headphones", 5000),
			new Product(4111, "Book", 2000)
			);
	// return all the products
	public List<Product> getProducts() {
		return products;
	}
}
