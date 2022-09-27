package com.hsbc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserApi {

	@Autowired
	private UserService service;

	@GetMapping
	public List<User> getUsers() {
		return service.fetchUsers();
	}
	// api/users/100, api/users/200
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable("id") int userId) 
	{
		ResponseEntity<Object> response = null;
		try {
			User user = service.fetchUser(userId);
			response = ResponseEntity.status(200).body(user);
		} catch (UserNotFoundException e) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("error", e.getMessage());// 100 not found
			response = ResponseEntity.status(404).body(map);
		}
		return response;
	}
	
}
