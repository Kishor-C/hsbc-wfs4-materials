package com.hsbc.model.service;

import com.hsbc.model.beans.User;

public interface UserService {
	// this save() calls dao.save()
	public void save(User user);
}
