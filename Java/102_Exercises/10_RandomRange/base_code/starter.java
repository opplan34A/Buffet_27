/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner (System.in);

		System.out.println("please enter 2 integers to provide a range for your variable"); 
        System.out.println("please enter an integer : ");
		int numinput = Input.nextInt();
        System.out.println("");
         
		System.out.println("please enter another integer (larger than the first one) : ");
        int numinput2 = Input.nextInt(); 
        
		System.out.println ("your range is");
        int Randot = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
        System.out.print (Randot);



	}
}
