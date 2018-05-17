package com.xubing.service;

import com.xubing.bean.User;
import com.xubing.dao.UserDao;


public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean login(String username, String password){
		
		
		
		return false;
	}

	public User login(User user) {
		return this.userDao.login(user);
	}
	

}
