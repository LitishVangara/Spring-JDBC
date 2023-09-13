package com.jsp.jdbc2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.jsp.jdbc2.model.Employee3;

public class RowMapperDAOImp3 implements RowMapper<Employee3>
{
	public Employee3 mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		//Write a logic to Map records with Java Object
		Employee3 emp3 = new Employee3();
		//int id = rs.getInt("empid") - retrieve data
		//emp.setEmpId(id) - to store the data in Employee Object
		emp3.setEmpId(rs.getInt("eid"));
		emp3.setEname(rs.getString("ename"));
		emp3.setSalary(rs.getDouble("esalary"));
		emp3.setDeptno(rs.getInt("deptNo"));
		return emp3;
	}
	
}
