package com.jsp.jdbc1;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc1.config.EmployeeConfiguration1;
import com.jsp.jdbc1.dao.EmployeeDAO1;
import com.jsp.jdbc1.dao.EmployeeDAO2;
import com.jsp.jdbc1.dao.EmployeeDAOImp2;
import com.jsp.jdbc1.model.Employee1;

public class App1 
{
	public static void main( String[] args )
    {
		ApplicationContext context1 = new AnnotationConfigApplicationContext(EmployeeConfiguration1.class);
		EmployeeDAO1 employeeDAO1 = context1.getBean("empimp1", EmployeeDAO1.class);
		Employee1 employee1 = context1.getBean("employee1", Employee1.class);
        Scanner scan = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Enter the Details to Retrieve Data and Delete that Data from Database : ");
            System.out.println("Enter the Employee Id : ");
            int id = scan.nextInt();
            EmployeeDAO2 employeeDAO2 = context1.getBean("empimp2", EmployeeDAOImp2.class);
            List<Employee1> list2 = employeeDAO2.findEmployeeByEmpId(id);
            employee1.setEmpId(id);
            if (list2.size() > 0) 
            {
            	for (Employee1 employee12 : list2) 
            	{
            		System.out.println(employee12);
				}
			}
            else
            {
            	System.out.println("Invalid Employee ID....");
            }
            employeeDAO1.delete(employee1);
            System.out.println("Enter 'y' to Continue or 'n' to Exit Delete Session : ");
            String s = scan.next();
            if(s.equalsIgnoreCase("y"))
            {
            	continue;
            }
            else
            {
            	System.out.println("Thank you - Your Delete Session Ended...");
            	break;
            }
        }
    }
}
