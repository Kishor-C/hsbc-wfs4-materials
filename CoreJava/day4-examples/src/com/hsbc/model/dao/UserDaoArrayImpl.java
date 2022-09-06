package com.hsbc.model.dao;

import com.hsbc.model.beans.User;

public class UserDaoArrayImpl implements UserDao {
	// can store maximum 25 users
	private static User[] usersArray = new User[25];
	private static int indexCounter = 0;
	@Override
	public void save(User user) {
		usersArray[indexCounter++] = user;
	}

	@Override
	public User[] findAll() {
		User[] temp = new User[indexCounter];
		for(int index = 0; index < indexCounter; index++) {
			temp[index] = usersArray[index];
		}
		return temp;
	}

	@Override
	public User findUser(int id) {
		User[] users = findAll();
		for(User u : users)
			if(u.getUserId() == id) 
				return u;
		return null;
	}
	
}
