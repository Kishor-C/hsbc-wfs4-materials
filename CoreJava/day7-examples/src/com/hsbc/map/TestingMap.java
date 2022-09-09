package com.hsbc.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hsbc.beans.Employee;

public class TestingMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "user123");
		map.put("password", "12345");
		map.put("department", "Sales");
		System.out.println("Get username: "+map.get("username"));
		// you don't have iterator in Map, but you can use keySet() and call iterator
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key = "+key+", Value = "+map.get(key));
		}
		// you can also store collection as a value when you to group
		Map<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();
		// employeeMap.put("someKey", listOfEmployees);
	}
}
