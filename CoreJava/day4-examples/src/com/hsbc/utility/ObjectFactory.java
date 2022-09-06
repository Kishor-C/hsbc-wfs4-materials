package com.hsbc.utility;

import com.hsbc.model.dao.UserDao;
import com.hsbc.model.dao.UserDaoArrayImpl;

public class ObjectFactory {
	public static UserDao getInstance(int choice) {
		switch(choice) {
		case 1: 
			return new UserDaoArrayImpl();
		case 2: 
			return null;
		default : 
				return new UserDaoArrayImpl();
		}
	}
}
