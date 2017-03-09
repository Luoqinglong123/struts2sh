package com.lql.spring.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lql.spring.dao.UserDao;
import com.lql.spring.entity.User;
import com.lql.spring.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public Serializable addUser(User user) {
		return userDao.addUser(user);
	}

}
