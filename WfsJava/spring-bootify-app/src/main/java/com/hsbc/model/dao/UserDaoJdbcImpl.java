package com.hsbc.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	@Override
	public List<User> getAllUsers() {
		String query2 = "select * from users";
		// query method returns List<T>, its 2nd argument is a 
		// RowMapper<T> that has a method which is called on each 
		// row, method is: public T mapRow(ResultSet, int)
		
		List<User> users = jdbc.query(query2, (rs, rowNum) -> 
				new User(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		return users;
	}

	@Override
	public User getUser(int userid) {
		String query = "select * from users where userid = ?";
		RowMapper<User> rowMapper = (rs, rowNum) -> 
			new User(rs.getInt(1), rs.getString(2), rs.getInt(3));
		try {
			return jdbc.queryForObject(query, rowMapper, userid);
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public void deleteUser(int userid) {
		String query = "delete from users where userid = ?";
		jdbc.update(query, userid);
	}

}
