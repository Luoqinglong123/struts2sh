package com.lql.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lql.spring.dao.UserDao;
import com.lql.spring.entity.User;
import com.lql.spring.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

	@Override
	public User loginValidate(User user) {
		List<User> userList = userDao.getUsers(user);

		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		}

		return null;
	}

}
