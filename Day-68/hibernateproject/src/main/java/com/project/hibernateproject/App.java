package com.project.hibernateproject;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try(Scanner sc = new Scanner(System.in))
    	{
    		int choice = 0;
    		do {
	    		System.out.println("Select 1 for Student / 2 for Course / 3 for exit");
	    		choice = sc.nextInt();
	    		if(choice == 1)
	    		{
	    			StudentAction action = new StudentAction();
	    			action.main();
	    		}else if(choice == 2)
	    		{
	    			System.out.println("Working on Course Part....");
	    		}
	    		else if(choice == 3)
	    		{
	    			System.out.print("Exiting...");
	    			return;
	    		}
    		}while(choice != 3);
    	}
//    	catch(IOException e) {}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
