package com.hsbc.model.dao;

import com.hsbc.exceptions.UserCreationException;
import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;

public interface UserDao {
	public void save(User user) throws UserCreationException;
	public User[] findAll();
	public User findUser(int id) throws UserNotFoundException;
}
