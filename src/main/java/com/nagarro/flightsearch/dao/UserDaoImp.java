package com.nagarro.flightsearch.dao;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.SessionFactory;
import com.nagarro.flightsearch.model.User;

@Component
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public User getUser(String username) {
		
		Session session= sessionFactory.getCurrentSession();
		User user = session.get(User.class, username);

		return user;

	}

	@Override
	@Transactional
	public User addUser(User user) {
		
		Session session= sessionFactory.getCurrentSession();
		session.save(user);

		return user;
	}
	
	

}