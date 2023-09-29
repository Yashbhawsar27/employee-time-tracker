package com.cetpa.admin.repository.impl;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.cetpa.admin.entity.User;
import com.cetpa.admin.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository 
{
	private Session session;
	private Transaction transaction;
	
	public UserRepositoryImpl(SessionFactory factory)
	{
		session=factory.openSession();
		transaction=session.getTransaction(); 
	}
	public List<User> getUserList() 
	{
		Query<User> query=session.createQuery("from User",User.class);
		return query.list();
	}
	public void createAccount(User user) 
	{
		transaction.begin();
		session.save(user);
		transaction.commit();
	}
	public User getUserByPhone(String phone) 
	{
		Query<User> query=session.createQuery("from User where phone=:arg",User.class);
		query.setParameter("arg",phone);
		return query.uniqueResult();
	}
	public User getUser(String uid) 
	{
		return session.get(User.class,uid);
	}
	public void deleteUser(User user) 
	{
		transaction.begin();
		session.delete(user);
		transaction.commit();
	}
}
