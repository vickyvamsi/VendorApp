package com.app.dao;

import com.app.model.User;

public interface IUserDao {
	
	public int saveUser(User u);
	public User getUserByNameAndPwd(String un,String pwd);
}

