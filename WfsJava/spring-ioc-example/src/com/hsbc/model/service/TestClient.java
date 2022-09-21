package com.hsbc.model.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.beans.DBConfig;

public class TestClient {

	public static void main(String[] args) {
		// initialize spring container that reads xml file
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("context.xml");
		DBConfig cfg = (DBConfig)ctx.getBean("db1");
		System.out.println("Username = "+cfg.getUsername());
		System.out.println("URL = "+cfg.getUrl());
		System.out.println("Password = "+cfg.getPassword());
	}
	/*
	 * Create another implementation of TestService & change
	 * only xml file so that without changing
	 * TestClient m1() of new implementation must be called
	 */

}
