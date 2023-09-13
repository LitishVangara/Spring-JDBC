package com.jsp.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jsp.jdbc.model.Employee;

@Component("empimp")
public class EmployeeDAOImp implements EmployeeDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insert(Employee employee) 
	{
		String insert = "insert into employee (eid,ename,esalary,deptNo) values(?,?,?,?)";
		int num = jdbcTemplate.update(insert, employee.getEmpId(), employee.getEmpName(), employee.getEmpSalary(), employee.getDeptNo());
		if(num!=0)
		{
			System.out.println("Record Inserted...");
		}
		else
		{
			System.out.println("Record is not Inserted...");
		}
	}
}
