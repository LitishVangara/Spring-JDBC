package com.jsp.main;

import java.util.Scanner;

import com.jsp.jdbc.App;
import com.jsp.jdbc1.App1;
import com.jsp.jdbc2.App3;

public class InsertDeleteRetrieveMainClass 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    while(true)
	    {
	    	System.out.println("Welcome to Employee Details and DataBase.");
	    	System.out.println("Enter 1 for Insert the Record, 2 for Delete the Record, 3 for Retrieve the Record, or 4 to Exit the Employee Details and DataBase Session :");
	    	int choice = scan.nextInt();
	    	 switch (choice) 
	            {
	            case 1 : App.main(null);
	            	break;
	            case 2 : App1.main(null);
	            	break;
	            case 3 : App3.main(null);
	            	break;
	            case 4 : System.out.println("Thank you - Your Session Ended...");
	            	break;
	            default : System.out.println("Invalid Input (Choice).");
                	break;
	            }
	    	System.out.println("Enter 'y' to Continue the Session or 'n' to Exit to exit the Full Session : ");
            String s = scan.next();
            if(s.equalsIgnoreCase("y"))
            {
            	continue;
            }
            else
            {
            	System.out.println("Thank you - Your Full Session Ended...");
            	System.out.println("     Have  A  Nice  Day....");
            	break;
            }
        }
	}
}
