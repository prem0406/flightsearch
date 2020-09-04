package com.nagarro.flightsearch.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * User class is an user entity that is stored in database for login
 * functionality.
 * 
 */

@Entity
@Table(name = "user")
public class User {

	@Id
	String userName;
	String password;
	String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String uName) {
		this.userName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String uPswd) {
		this.password = uPswd;
	}
}