package com.app.service;

import com.app.model.User;

public interface IUserService {

	public int saveUser(User u);
	public User getUserByNameAndPwd(String un,String pwd);
}
