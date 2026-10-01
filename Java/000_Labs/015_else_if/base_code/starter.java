/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
       Scanner In = new Scanner(System.in);

       int Ran =  (int)(Math.random() * 1000) + 1; 
        
       

		System.out.println("please provide a number. Your number will be compared to another radnomly generated number."); 
		System.out.println (" You will be notified if your number is greater or less than that number ");
		System.out.println ("now please provide a number");
        
		int put = In.nextInt();
		boolean yes = Ran == put ;
        
		boolean lessthan = put < Ran ;
		
		boolean morethan = put > Ran ;

		if  (yes) {
			System.out.print ("congrats you got the answer");
           

		}
		else if (lessthan) {
           System.out.println ("your answer is less than the number please try again");



		}
		else if (morethan) {
			System.out.println ("your answer is greater than the number please try again");
		}
         

		
	}
}
