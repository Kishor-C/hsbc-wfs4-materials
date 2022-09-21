package com.hsbc.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.model.beans.User;

@Repository
public class UserDaoJdbcImpl implements UserDao {
	/*
	 * We must inject JdbcTemplate to the DAO
	 */
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void save(User user) {
		String query = "insert into users values(?, ?, ?)";
		jdbc.update(query, 
				user.getUserId(), user.getName(), user.getPhone());
	}

	

}
