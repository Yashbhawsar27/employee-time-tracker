package com.cetpa.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.admin.entity.User;
import com.cetpa.admin.repository.UserRepository;
import com.cetpa.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired private UserRepository userRepository;

	public List<User> getList() 
	{
		return userRepository.getUserList();
	}
	public void createUserAccount(User user) 
	{
		userRepository.createAccount(user);
	}
	public User getUserByPhone(String phone) 
	{
		return userRepository.getUserByPhone(phone);
	}
	public void deleteUser(String uid) 
	{
		User user=userRepository.getUser(uid);
		userRepository.deleteUser(user);
	}
}
