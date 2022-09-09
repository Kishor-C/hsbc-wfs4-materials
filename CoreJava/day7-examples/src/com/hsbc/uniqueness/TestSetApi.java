package com.hsbc.uniqueness;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetApi {
	public static void main(String[] args) {
		// Try using ArrayList & LinkedList with duplicate items
		Set<String> strings = null;
		//strings = new HashSet<String>();
//		strings = new TreeSet<String>();
		strings = new LinkedHashSet<String>();
		strings.add("grapes");
		strings.add("Apple");
		strings.add("APPLE");
		strings.add("Grapes");
		strings.add("Orange");
		strings.add("orange");
		System.out.println("Size = "+strings.size());
		for(String s : strings) {
			System.out.println(s);
		}
	}
}
