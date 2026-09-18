/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    Scanner Input = new Scanner (System.in);
    System.out.println ("please provide an integer");
    int numinput = Input.nextInt(); 
	System.out.println ("here are the next 5 integers");

	System.out.print (numinput+1);
    System.out.print (",");
  
    System.out.print (numinput+2); 
    System.out.print (",");

	System.out.print (numinput+3);
	System.out.print (",");

	System.out.print (numinput+4); 
    System.out.print (",");

	System.out.println (numinput+5);

	System.out.println ("now here are the next five multiples of your integer");
    
    System.out.print (numinput*2);
	System.out.print (",");

	System.out.print (numinput*3);
	System.out.print (",");

	System.out.print (numinput*4);
    System.out.print (",");

	System.out.print (numinput*5);
	System.out.print (",");

	System.out.print (numinput*6);
    System.out.println (",");
	
	System.out.println("");
     
    System.out.println("now here is your integer divided by 100");

	System.out.println ((numinput+0.0)/100);
    
    System.out.println("now here is your integer divided by 10");
    
	System.out.print ((numinput+0.0)/10);

	}
}
