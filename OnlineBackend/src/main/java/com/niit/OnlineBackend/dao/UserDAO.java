package com.niit.OnlineBackend.dao;

import com.niit.OnlineBackend.model.User;

public interface UserDAO
{
	boolean addUser(User user);
	
	User getByEmail(String email);
	
}
