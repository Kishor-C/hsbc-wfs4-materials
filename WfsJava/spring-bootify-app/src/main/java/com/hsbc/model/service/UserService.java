package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;

public interface UserService {
	// this save() calls dao.save()
	public void save(User user);
	// this fetchUsers() calls dao.getAllUsers();
	public List<User> fetchUsers();
	// fetchUser() calls dao.getUser()
	public User fetchUser(int userid) throws UserNotFoundException;
	// deleteUser() calls dao.deleteUser()
	public void deleteUser(int userid) throws UserNotFoundException;
}
