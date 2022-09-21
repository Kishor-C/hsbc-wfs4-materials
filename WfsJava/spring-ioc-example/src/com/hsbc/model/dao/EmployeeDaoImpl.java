package com.hsbc.model.dao;

import com.hsbc.model.beans.DBConfig;

// this is a DAO layer class
public class EmployeeDaoImpl {

	private DBConfig dbConfig; // spring must initialize this

	public DBConfig getDbConfig() {
		return dbConfig;
	}
	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}
	
	public void verifyProperties() {
		System.out.println("_____DAO Layer____");
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUsername());
		System.out.println(dbConfig.getPassword());
	}
}
