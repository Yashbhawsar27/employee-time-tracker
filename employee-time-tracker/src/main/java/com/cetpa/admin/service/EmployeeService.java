package com.cetpa.admin.service;

import java.util.List;

import com.cetpa.admin.entity.Employee;

public interface EmployeeService 
{
	List<Employee> getList();
	void saveRecord(Employee employee);
	void deleteRecord(int eid);
	Employee getRecord(int eid);
	void updateRecord(Employee employee);
}
