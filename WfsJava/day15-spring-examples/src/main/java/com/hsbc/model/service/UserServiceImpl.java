package com.hsbc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		if(user != null) {
			userDao.save(user);
		} else {
			throw new RuntimeException("User is null");
		}
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> fetchUsers() {
		// there could be business logics before interacting to DAO
		return userDao.getAllUsers();
	}

	@Override
	public User fetchUser(int userid) throws UserNotFoundException {
		User user = userDao.getUser(userid);
		if(user == null) {
			throw new UserNotFoundException("User "+userid+" not found");
		}
		else {
			return user;
		}
	}

	@Override
	public void deleteUser(int userid) throws UserNotFoundException {
		User user = fetchUser(userid);
		// here fetchUser is already checking for null and throws Exception
		if(user != null) {
			userDao.deleteUser(userid);
		}
	}
	
}
