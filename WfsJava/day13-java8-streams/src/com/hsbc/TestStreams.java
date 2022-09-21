package com.hsbc;

import java.util.Arrays;
import java.util.List;

public class TestStreams {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 1, 4, 5, 7, 8);
		int sum = integers
					.stream()
					.mapToInt(item -> item)
					.sum();
		// mapToInt
		System.out.println(sum);
		
	}
} 
