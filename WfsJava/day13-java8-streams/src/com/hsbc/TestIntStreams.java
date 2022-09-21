package com.hsbc;

import java.util.Arrays;
import java.util.List;

public class TestIntStreams {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(6, 7, 1, 2, 8, 5, 3);
		integers.forEach((item) -> System.out.println(item));
		System.out.println("___________________");
		integers.stream()
			.filter(item -> item % 2 == 0)
			.sorted((i1, i2) -> Integer.compare(i2,  i1))
			.forEach(item -> System.out.println(item));
	}
}
