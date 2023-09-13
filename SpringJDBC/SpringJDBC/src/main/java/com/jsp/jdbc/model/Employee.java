package com.jsp.jdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private int empid;
	private String empName;
	private double empSalary;
	private int deptNo;
	public int getEmpId() 
	{
		return empid;
	}
	public void setEmpId(int empid) 
	{
		this.empid = empid;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public double getEmpSalary() 
	{
		return empSalary;
	}
	public void setEmpSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}
	public int getDeptNo() 
	{
		return deptNo;
	}
	public void setDeptNo(int deptNo) 
	{
		this.deptNo = deptNo;
	}
	@Override
	public String toString() 
	{
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", deptNo=" + deptNo
				+ "]";
	}
}
