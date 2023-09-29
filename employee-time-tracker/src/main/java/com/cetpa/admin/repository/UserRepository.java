package com.cetpa.admin.repository;

import java.util.List;

import com.cetpa.admin.entity.User;

public interface UserRepository
{
	List<User> getUserList();
	void createAccount(User user);
	User getUserByPhone(String phone);
	User getUser(String uid);
	void deleteUser(User user);
}
