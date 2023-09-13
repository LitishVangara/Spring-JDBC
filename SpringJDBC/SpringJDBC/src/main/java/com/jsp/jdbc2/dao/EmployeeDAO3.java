package com.jsp.jdbc2.dao;

import java.util.List;

import com.jsp.jdbc2.model.Employee3;

public interface EmployeeDAO3 
{
	// to retrieve employee details based on empid
	List<Employee3> findEmpByEmpId(int EmpId1);
}
