package com.lql.spring.service;

import java.io.Serializable;

import com.lql.spring.entity.User;

public interface UserService {
	
	Serializable addUser(User user);
}
