package com.hsbc.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
