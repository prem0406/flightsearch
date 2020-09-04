package com.nagarro.flightsearch.service;

import org.springframework.stereotype.Service;

import com.nagarro.flightsearch.model.User;

@Service
public class AdminService {
	public boolean validateAdmin(String userName, String password) {


		return userName.equals("admin") && password.equals("admin");

	}
}
