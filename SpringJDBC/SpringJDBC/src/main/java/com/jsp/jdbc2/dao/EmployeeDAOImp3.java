package com.jsp.jdbc2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.jdbc2.model.Employee3;

@Component("empimp3")
public class EmployeeDAOImp3 implements EmployeeDAO3
{
	@Autowired
	private JdbcTemplate jdbcTemplate3;
	public List<Employee3> findEmpByEmpId(int EmpId1) 
	{
		String query = "select * from employee where eid = ?";
		RowMapper<Employee3> rm = new RowMapperDAOImp3();
		List<Employee3> result3 = jdbcTemplate3.query(query, rm, EmpId1);
		return result3;
	}
}
