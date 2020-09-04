package com.nagarro.flightsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.flightsearch.dao.UserDao;
import com.nagarro.flightsearch.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public User getUser(String username) {
		return dao.getUser(username);
	}
	
	public boolean validateUser(String userName, String password) {

		User user = dao.getUser(userName);

		return user != null && user.getPassword().equals(password);

	}
	
	public void add(User user) {
		dao.addUser(user);
	}
}
