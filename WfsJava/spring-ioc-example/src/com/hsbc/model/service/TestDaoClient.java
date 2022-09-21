package com.hsbc.model.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.dao.EmployeeDaoImpl;

public class TestDaoClient {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("context.xml");
		EmployeeDaoImpl impl = (EmployeeDaoImpl)ctx.getBean("dao");
		impl.verifyProperties();
	}

}
