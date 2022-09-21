package com.hsbc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hsbc.beans.Product;

public class ProductsSorting {
	public static void main(String[] args) {
		List<Product> list = Arrays.asList(
				new Product(555, "Acer", 50000, 3.8),
				new Product(222, "Lenovo", 40000, 4.2),
				new Product(111, "HP", 60000, 3.9),
				new Product(888, "Dell", 70000, 4.3),
				new Product(666, "Asus", 80000, 4.0),
				new Product(444, "Mac", 90000, 4.8),
				new Product(777, "Alienware", 80000, 3.6)
				);
		// old approach, sorting based on 
		Collections.sort(list, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return Integer.compare(p1.getId(), p2.getId());
			}
		});
		System.out.println("_____Sorting based on id________");
		printProducts(list);
		// new approach, using lambda expression 
		System.out.println("____Sorting based on Ratings____");
		Collections.sort(list, 
		(p1, p2) -> Double.compare(p2.getRatings(), p1.getRatings()));
		printProducts(list);
		// using lambda sort based on price 
		System.out.println("_____Sorting based on Price____");
		list.sort((p1, p2) -> 
			Double.compare(p1.getPrice(), p2.getPrice()));
		printProducts(list);
	}
	public static void printProducts(List<Product> products) {
		for(Product product : products) 
			System.out.println(product);
		System.out.println("____________________________");
	}

}
