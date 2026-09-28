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
        
		System.out.println ("here are five numbers printed in that range");
        int Randot = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
		int Randot2 = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
		int Randot3 = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
		int Randot4 = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
		int Randot5 = (int) (Math.random () * (numinput2 - numinput) + numinput) ;
        
		System.out.print (Randot);
		System.out.print (", ");

        System.out.print (Randot2);
        System.out.print (", ");
        
		System.out.print (Randot3);
		System.out.print (", ");
        
        System.out.print (Randot4);
		System.out.print (", ");
		 
        System.out.print (Randot5);
        System.out.print (", ");



	}
}
