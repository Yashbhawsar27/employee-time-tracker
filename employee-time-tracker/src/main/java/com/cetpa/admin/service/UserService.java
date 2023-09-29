package com.cetpa.admin.service;

import java.util.List;

import com.cetpa.admin.entity.User;

public interface UserService 
{
	List<User> getList();
	void createUserAccount(User user);
	User getUserByPhone(String phone);
	void deleteUser(String uid);
}
