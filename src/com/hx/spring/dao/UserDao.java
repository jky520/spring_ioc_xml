package com.hx.spring.dao;

import com.hx.spring.entity.User;

public interface UserDao {
	
	void add(User user);
	
	void delete(int id);
	
	User load(int id);
}
