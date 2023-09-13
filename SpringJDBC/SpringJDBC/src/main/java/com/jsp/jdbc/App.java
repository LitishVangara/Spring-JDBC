package com.jsp.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc.dao.EmployeeDAO;
import com.jsp.jdbc.model.Employee;
import com.jsp.jdbc.config.EmployeeConfiguration;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        EmployeeDAO employeeDAO = context.getBean("empimp", EmployeeDAO.class);
        Employee employee = context.getBean("employee", Employee.class);
        Scanner scan = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Enter the Details to Insert the Data into Database : ");
            System.out.println("Enter the Employee Id : ");
            int id = scan.nextInt();
            System.out.println("Enter the Employee Name : ");
            String name = scan.next();
            System.out.println("Enter the Employee Salary : ");
            double sal = scan.nextDouble();
            System.out.println("Enter the Employee Department Number : ");
            int deptno = scan.nextInt();
            employee.setEmpId(id);
            employee.setEmpName(name);
            employee.setEmpSalary(sal);
            employee.setDeptNo(deptno);
            employeeDAO.insert(employee);
            System.out.println(employee);
            System.out.println("Enter 'y' to Continue or 'n' to Exit the Insert Session :");
            String s = scan.next();
            if(s.equalsIgnoreCase("y"))
            {
            	continue;
            }
            else
            {
            	System.out.println("Thank you - Your Insert Session Ended...");
            	break;
            }
        }
    }
}
