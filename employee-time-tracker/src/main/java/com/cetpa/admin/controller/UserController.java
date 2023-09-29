package com.cetpa.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.admin.entity.Employee;
import com.cetpa.admin.entity.User;
import com.cetpa.admin.service.UserService;

@Controller
@RequestMapping("admin/user")
public class UserController 
{
	@Autowired private UserService userService;
	
	@RequestMapping("dashboard")
	public String getUserDashboard(Model model,HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "redirect:admin/login";
		}
		List<User> userList=userService.getList();
		model.addAttribute("ulist",userList);
		return "admin/user/user-dashboard";
	}
	@RequestMapping("add")
	public String getAddUserView()
	{
		return "admin/user/add-user";
	}
	@RequestMapping("save-record")
	public String saveUserRecord(User user,Model model)
	{
		User user1=userService.getUserByPhone(user.getPhone());
		if(user1!=null)
		{
			model.addAttribute("msg","User with phone number "+user.getPhone()+" already registered");
			return "admin/user/add-user";
		}
		userService.createUserAccount(user);
		return "redirect:dashboard";
	}
	@RequestMapping("delete-record")
	public String deleteUserAccount(String uid)
	{
		userService.deleteUser(uid);
		return "redirect:dashboard";
	}
}
