package com.jsp.jdbc1.dao;

import java.util.List;

import com.jsp.jdbc1.model.Employee1;

public interface EmployeeDAO2 
{
	// to retrieve employee details based on empid
	List<Employee1> findEmployeeByEmpId(int EmpId);
}
