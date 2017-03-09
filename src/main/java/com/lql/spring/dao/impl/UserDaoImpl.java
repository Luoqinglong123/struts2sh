package com.lql.spring.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lql.spring.dao.UserDao;
import com.lql.spring.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable addUser(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> getUsers(User user) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from tb_user user where user.loginName = ? and user.password = ?");
		query.setString(0, user.getLoginName());
		query.setString(1, user.getPassword());
		return query.list();

	}

}
