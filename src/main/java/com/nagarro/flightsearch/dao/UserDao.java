
package com.nagarro.flightsearch.dao;

import org.springframework.stereotype.Component;

import com.nagarro.flightsearch.model.User;
@Component
public interface UserDao {

	public User getUser(String uId);
	public User addUser(User user);

}