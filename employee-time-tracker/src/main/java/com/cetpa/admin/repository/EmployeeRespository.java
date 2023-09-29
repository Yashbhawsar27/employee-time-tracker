package com.cetpa.admin.repository;

import java.util.List;

import com.cetpa.admin.entity.Employee;

public interface EmployeeRespository 
{
	List<Employee> getList();
	void saveEmployee(Employee employee);
	Employee getEmployee(int eid);
	void deleteEmployee(Employee employee);
	void updateEmployee(Employee empold, Employee empnew);
}
