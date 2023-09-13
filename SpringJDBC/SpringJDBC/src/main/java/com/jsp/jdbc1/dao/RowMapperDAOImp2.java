package com.jsp.jdbc1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.jdbc1.model.Employee1;

public class RowMapperDAOImp2
{
	public static List<Employee1> getEmployees(ResultSet rs) throws SQLException 
	{
		List<Employee1> employees = new ArrayList<>();
		//Write a logic to Map records with Java Object
		while(rs.next()) {
		Employee1 emp1 = new Employee1();
		//int id = rs.getInt("empid") - retrieve data
		//emp.setEmpId(id) - to store the data in Employee Object
		emp1.setEmpId(rs.getInt("eid"));
		emp1.setEname(rs.getString("ename"));
		emp1.setSalary(rs.getDouble("esalary"));
		emp1.setDeptno(rs.getInt("deptNo"));
		employees.add(emp1);
		}
		return employees;
	}
}
