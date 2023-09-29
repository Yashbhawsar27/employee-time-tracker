package com.cetpa.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.admin.entity.Employee;
import com.cetpa.admin.repository.EmployeeRespository;
import com.cetpa.admin.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRespository employeeRespository;

	public List<Employee> getList() 
	{
		return employeeRespository.getList();
	}
	public void saveRecord(Employee employee) 
	{
		employeeRespository.saveEmployee(employee);
	}
	public void deleteRecord(int eid) 
	{
		Employee employee=employeeRespository.getEmployee(eid);
		employeeRespository.deleteEmployee(employee);
	}
	public Employee getRecord(int eid) 
	{
		return employeeRespository.getEmployee(eid);
	}
	public void updateRecord(Employee empnew) 
	{
		Employee empold=employeeRespository.getEmployee(empnew.getEid());
		employeeRespository.updateEmployee(empold,empnew);
	} 
}
