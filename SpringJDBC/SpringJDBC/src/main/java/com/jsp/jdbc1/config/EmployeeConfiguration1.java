package com.jsp.jdbc1.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.jsp.jdbc1")
public class EmployeeConfiguration1 
{
	@Bean
	public JdbcTemplate makeConnection()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getConnection());
		return jdbcTemplate;
	}
	@Bean
	public DataSource getConnection()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/litishdatabase?");
		dataSource.setUsername("root");
		dataSource.setPassword("Litish17@");
		return dataSource;
	}
}
