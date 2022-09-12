package com.hsbc.factory;

import com.hsbc.model.dao.EmployeeDao;
import com.hsbc.model.dao.EmployeeDaoJdbcImpl;

// Factory class that returns EmployeeDao implementation
public class ObjectFactory {
	public static EmployeeDao getEmployeeDao(int choice) {
		switch(choice) {
		case 1: 
			return new EmployeeDaoJdbcImpl();
		}
		return new EmployeeDaoJdbcImpl();
	}
}
