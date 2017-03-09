package com.lql.spring.dao;

import java.io.Serializable;
import java.util.List;

import com.lql.spring.entity.User;

public interface UserDao {
	Serializable addUser(User user);
	
	public List<User> getUsers(User user);

}
