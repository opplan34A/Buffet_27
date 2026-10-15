/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
		int stop = 0;
		System.out.println ("Hello there please provide a name ");
        String uname = sc.nextLine();

		System.out.println ("how many times do you want to print out your name?");
		System.out.println ("side note has to be an integer no decimals or negatives");
	
		int printnum = sc.nextInt();
        System.out.println ("");    

       if (printnum <=0) { // provide different int starting brackets 
		System.out.println ("please provide a different integer");
        int printnumT = sc.nextInt();
		while (true) { // while starting brackets. 
			if (stop == printnumT) {
				break;
			}
			System.out.println (uname);
			stop = stop + 1;
		} // while ending brackets.

	   } // if ending brackets
	   else {  // else starting brackets
		while (true){ //while statment starting brackets. 
			if (stop == printnum) { 
				break;
			}
           System.out.println (uname);
           stop = stop + 1;

		} // true/while statment ending brackets


		
	} // else ending brackets
	
	} // void ending brackets
}
