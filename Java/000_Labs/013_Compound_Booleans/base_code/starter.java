/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
       
	    Scanner sc = new Scanner(System.in);

		System.out.println("Please provide three INTEGERS");

		System.out.println ("Please Provide integer one");
        int iA = sc.nextInt ();

		System.out.println ("Please Provide integer two");
        int iB = sc.nextInt ();

		System.out.println ("Please Provide integer three");
        int iC = sc.nextInt ();
       
        
         
		System.out.println ("Here is your largest integer");


		 if ((iC < iB)&&(iB < iA)) {
			System.out.print("the first integer ");
			System.out.println (iA);
			System.out.println ("Is the largerst integer");
		 }


        if ((iC < iA)&&(iA < iB)) {

           System.out.println ("the second integer " + iB);
		   System.out.println ("is the largest integer");

		}


		 if ((iA < iB) && (iB < iC)) {

			System.out.println ("the third integer " + iC);
			System.out.println ("is the largest integer");


		 }
        System.out.println ("");
        
		 if ((iA < iB) && (iB < iC)) {

			System.out.println ("your smallest integer is " + iA);
			
		 }
        System.out.println("");
       
	    if ((iB < iA)&&(iA < iC)) {

           System.out.println ("the smallest integer is " + iB);
		   

		}
	
		if ((iC < iB)&&(iB < iC)) {
			System.out.println ("the smallest integer is" + iC);
		}

	}
}
