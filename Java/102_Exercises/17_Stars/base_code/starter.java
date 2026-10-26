/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int countstopW = 0;
		int countstopH = 0;

		System.out.println("This code will make a shape with a certain dimensions"); 
        System.out.println("The first shape will be a square/rectangle"); 
        
        System.out.println ("");
		
		System.out.println ("please enter an integer for the width: ");
        int FW = sc.nextInt();

		System.out.println ("Please enter an integer for the height: ");
		int FH = sc.nextInt();
        while (countstopH < FH) { // while height starting brackets
        if (FH == countstopH) { // if count height stop starting brackets
           break; 
		} //if count stop height ending 
      
	  System.out.println ();  
		while (countstopW < FW) {// while width statement starting brackets
		
		if (FW == countstopW) { // if  count stops width tarting brackets
            break;

		} // if ending brackets
		System.out.print("*");
        countstopW++;
		
		
		} // while width ending brackets
	    countstopW = 0;
		countstopH++;

		} // while height ending brackets

	}
}
