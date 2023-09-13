package com.jsp.jdbc2;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc2.config.EmployeeConfiguration2;
import com.jsp.jdbc2.dao.EmployeeDAO3;
import com.jsp.jdbc2.dao.EmployeeDAOImp3;
import com.jsp.jdbc2.model.Employee3;

public class App3 
{
	public static void main(String[] args) 
	{
		ApplicationContext context2 = new AnnotationConfigApplicationContext(EmployeeConfiguration2.class);
		Scanner scan = new Scanner(System.in);
		while(true)
        {
        	System.out.println("Enter the Details to Retrieve Data from Database : ");
            System.out.println("Enter the Employee Id : ");
            int id = scan.nextInt();
            EmployeeDAO3 employeeDAO3 = context2.getBean("empimp3", EmployeeDAOImp3.class);
            List<Employee3> list2 = employeeDAO3.findEmpByEmpId(id);
            if (list2.size() > 0) 
            {
            	for (Employee3 employee2 : list2) 
            	{
            		System.out.println(employee2);
				}
			}
            else
            {
            	System.out.println("Invalid Employee ID....");
            }
            System.out.println("Enter 'y' to Continue or 'n' to Exit Retrieve Session : ");
            String s = scan.next();
            if(s.equalsIgnoreCase("y"))
            {
            	continue;
            }
            else
            {
            	System.out.println("Thank you - Your Retrieve Session Ended...");
            	break;
            }
        }
	}
}
