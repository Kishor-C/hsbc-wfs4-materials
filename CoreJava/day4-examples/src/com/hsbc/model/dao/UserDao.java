package com.hsbc.model.dao;

import com.hsbc.model.beans.User;

public interface UserDao {
	public void save(User user);
	public User[] findAll();
	public User findUser(int id);
}
