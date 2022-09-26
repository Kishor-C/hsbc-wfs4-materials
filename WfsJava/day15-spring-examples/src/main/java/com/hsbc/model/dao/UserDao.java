package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.model.beans.User;
/*
 * Atleast we must have save(User), getUser(int id), getAllUsers(),
 * updateUser(id, User), deleteUser(int id) 
 */
public interface UserDao {
	//in real example save(User) must be created
	public void save(User user);
	public List<User> getAllUsers();
	public User getUser(int userid);
	public void deleteUser(int userid);
}
