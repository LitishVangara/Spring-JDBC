package com.jsp.jdbc1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.jdbc1.model.Employee1;

@Component("empimp2")
public class EmployeeDAOImp2 implements EmployeeDAO2
{
	@Autowired
	private JdbcTemplate jdbcTemplate2;
	public List<Employee1> findEmployeeByEmpId(int EmpId) 
	{
		String query = "select * from employee where eid = ?";
//		RowMapper<Employee1> rm = new RowMapperDAOImp2();
		List<Employee1> result1 = jdbcTemplate2.query(query, new Object[]{ EmpId}, RowMapperDAOImp2::getEmployees);
		return result1;
	}
}
