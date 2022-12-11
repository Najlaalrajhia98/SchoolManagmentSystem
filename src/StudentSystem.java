import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-7
 *
 */
public class StudentSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		  
		System.out.println("  WELCOME TO UTAS MANAGMENT SYSTEM ");
		System.out.println("  \n ");
		ArrayList<String> ManagmentSys = new ArrayList<String>();
		ArrayList<Object> StudentRecords = new ArrayList<Object>();
		ManagmentSys.add("\n 1- Manage Student");
		ManagmentSys.add("\n 2- Register student");
		ManagmentSys.add("\n 3- Hire Teachers");
		ManagmentSys.add("\n4- Manage Teachers");
	    
	    System.out.println("please Enter your addmission ID :");
	    int admissionid = sc1.nextInt();
	    
	   if (admissionid == 1111) {
		   System.out.println("your logged in ");
		   System.out.println("please select from the given menu:");
		   System.out.println(ManagmentSys);
		   System.out.println("Enter the choice number:");
		   }
	   else { 
		   System.out.println("Wrong pass ");
	   }

	   int userselection = sc1.nextInt();
		    if (userselection==1) {
		 
		    	System.out.println("you can now manage student ");
		    	System.out.println("select a number from the given choices :");
		    	System.out.println("\n 1- ADD STUDENT , \n 2- DELETE STUDENT");
		    int	userchoice = sc1.nextInt();
		      
		    
		    	if (userchoice==1) {
		    		System.out.println(" provide student Info :");
		    		System.out.println(" student name :");
		    		String name1= sc1.next();
		    		StudentRecords.add(name1);
		    		System.out.println(" student Email :");
		    		String Email = sc1.next();
		    		StudentRecords.add(Email);
		    		System.out.println(" student ID :");
		    		int ID = sc1.nextInt();
		    		StudentRecords.add(ID);
		    		System.out.println(" RECORDS ADDED SUCCESSFULY :"); 
		    		System.out.println("New added records:"  + StudentRecords);
		    	}
		    	else if (userchoice==2) {
		    		System.out.println(" give Student ID you want to delete :"); 
		    		System.out.println(" student ID :");
		    		int ID = sc1.nextInt();
		    		
		    	} 
		    	else  {
	    
		    		System.out.println(" wronge selected number "); 	} }
		    
	   }
    }  

