import java.nio.channels.SelectionKey;
import java.util.ArrayList;
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
		String name ;
		int ID;
		String Email;
		
		ArrayList<String> ManagmentSys = new ArrayList<String>();
		ManagmentSys.add("1- Register student");
		ManagmentSys.add("2- Manage Student");
		ManagmentSys.add("3- Hire Teachers");
		ManagmentSys.add("4- Manage Teacher");
	    System.out.println(ManagmentSys);
	    
	    
	    System.out.println("plz enter you selected number from the list given:");
	    int userselection = sc1.nextInt();
	    
	    if (userselection==1) {
	    	
	    	System.out.println("youre in ");
	    	System.out.println("plz enter student name:");
	    	
	    	String studentname = sc1.next();
	    	
	    	System.out.println("plz enter student id:");
	    	int studentID = sc1.nextInt();
	    	
	    }
	    
	}

}
