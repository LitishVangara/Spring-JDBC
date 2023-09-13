package com.jsp.jdbc2.model;

import org.springframework.stereotype.Component;

@Component("employee3")
public class Employee3 
{
	private int empid;
	private String ename;
	private double salary;
	private int deptno;
	public int getEmpId() 
	{
		return empid;
	}
	public void setEmpId(int empid) 
	{
		this.empid = empid;
	}
	
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public int getDeptno() 
	{
		return deptno;
	}
	public void setDeptno(int deptno) 
	{
		this.deptno = deptno;
	}
	@Override
	public String toString() 
	{
		return "Employee1 [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
}
