package com.hsbc.model.service;

import java.util.Arrays;
import java.util.List;

import com.hsbc.model.beans.User;

public class UserService {
	private List<User> usersDB = Arrays.asList(
			new User(2, "Alex", 998800),
			new User(3, "Bruce", 88000),
			new User(4, "Chandler", 990323),
			new User(5, "Dexter", 88000)
	);
	// fetchUser accepts Id & returns User or null
	public User fetchUser(int id) {
		for(User u : usersDB) {
			if(u.getId() == id) {
				return u;
			}
		}
		// you must throw UserNotFoundException instead
		// of return null;
		return null;
	}
}
