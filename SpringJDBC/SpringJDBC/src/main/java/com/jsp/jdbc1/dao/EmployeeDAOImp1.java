package com.jsp.jdbc1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jsp.jdbc1.model.Employee1;

@Component("empimp1")
public class EmployeeDAOImp1 implements EmployeeDAO1
{
	@Autowired
	private JdbcTemplate jdbcTemplate1;
	public void delete(Employee1 employee1)
	{
		String delete = "delete from employee where eid = ?";
		int num = jdbcTemplate1.update(delete, employee1.getEmpId());
		if(num!=0)
		{
			System.out.println("Record Delete...");
		}
		else
		{
			System.out.println("Record Not Found...");
		}
	}
}
