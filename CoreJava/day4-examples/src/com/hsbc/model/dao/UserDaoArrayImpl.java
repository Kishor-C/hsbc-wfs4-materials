package com.hsbc.model.dao;

import com.hsbc.exceptions.UserCreationException;
import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;

public class UserDaoArrayImpl implements UserDao {
	// can store maximum 3 users
	private static User[] usersArray = new User[3];
	private static int indexCounter = 0;
	@Override
	public void save(User user) throws UserCreationException {
		if(indexCounter >= usersArray.length) {
			throw 
			new UserCreationException("User cannot be created because limit exceeded");
		} else {
			usersArray[indexCounter++] = user;
		}
	}
	@Override
	public User findUser(int id) throws UserNotFoundException {
		User[] users = findAll();
		for(User u : users)
			if(u.getUserId() == id) 
				return u;
		throw new UserNotFoundException("User with an id: "+id+" not found");
	}
	@Override
	public User[] findAll() {
		User[] temp = new User[indexCounter];
		for(int index = 0; index < indexCounter; index++) {
			temp[index] = usersArray[index];
		}
		return temp;
	}	
}
