package com.cetpa.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("admin/home")
	public String getHomeView()
	{
		return "admin/home";
	}
}
