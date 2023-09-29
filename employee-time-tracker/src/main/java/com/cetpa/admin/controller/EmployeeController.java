package com.cetpa.admin.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.admin.entity.Employee;
import com.cetpa.admin.service.EmployeeService;

@Controller
@RequestMapping("admin")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService; 
	
	@RequestMapping("login")
	public String getAdminLoginView()
	{
		return "admin/login";
	}
	@RequestMapping("authenticate-user")
	public String authenticateUser(String adminid,String pass,Model model,HttpSession ses)
	{
		if(adminid.equals("admin") && pass.equals("cetpa"))
		{
			ses.setAttribute("id",adminid);
			return "redirect:/admin";	
		}
		else
		{
			model.addAttribute("msg","Enterid id or password is incorrect");
			model.addAttribute("id",adminid);
			return "admin/login";
		}
	}
	@RequestMapping("")
	public String getAdminHomeView(HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "redirect:admin/login";
		}
		return "admin/home";
	}
	@RequestMapping("dashboard")
	public String getEmployeeDashboard(Model model,HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "redirect:admin/login";
		}
		List<Employee> employeeList=employeeService.getList();
		model.addAttribute("elist",employeeList);
		return "admin/dashboard/employee-dashboard";
	}
	@RequestMapping("add")
	public String getEmployeeAddView(HttpSession ses)
	{
		if(ses.getAttribute("id")==null)
		{
			return "redirect:admin/login";
		}
		return "admin/dashboard/add-employee";
	}
	@RequestMapping("save-record")
	public String saveEmployeeRecord(Employee employee)
	{
		employeeService.saveRecord(employee);
		return "redirect:dashboard";
	}
	@RequestMapping("delete-record")
	public String deleteEmployeeRecord(int eid)
	{
		employeeService.deleteRecord(eid);
		return "redirect:dashboard";
	}
	@RequestMapping("edit-record")
	public String getEmployeeEditView(int eid,Model model)
	{
		List<String> list=Arrays.asList("Training","Marketing","Accounts","Inventory","Sales","Human Resource");
		Employee employee=employeeService.getRecord(eid);
		model.addAttribute("emp",employee);
		model.addAttribute("dlist",list);
		return "edit-employee";
	}
	@RequestMapping("update-record")
	public String updateEmployeeRecord(Employee employee)
	{
		employeeService.updateRecord(employee);
		return "redirect:dashboard";
	}
	@RequestMapping("logout")
	public String adminLogout(HttpSession ses)
	{
		ses.invalidate();
		return "redirect:login";
	}
}
