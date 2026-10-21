/*
 *	Author:  Ruben Coleman Garcia
 *  Date: 10/19/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);

		System.out.println ("Hello there a random number between 1 and 1000 will be generated");
        System.out.println ("And you will guess what number it is");
        System.out.println ("you will be told if your answer is larger or smaller");
		System.out.println ("Good luck");
        int ran = (int)(Math.random() * 1000 + 1);
        int in = 0;
		int test = 0;
        System.out.println (ran);
		while (true) { //while statement starting brackets
		
		if (in == ran) { // if statement starting brackets
         
		 System.out.println ("congrats you guessed the number correctly");
		 System.out.println ("the number was " + ran);
         break;

		}// if statement ending brackets
      
	    else if (in == 0) { // else if starting brackets
			System.out.println ("now please provide an integer");
            in = sc.nextInt();
		} // else if ending brackets

		else if ( in < ran) { // else if starting brackets
        System.out.println ("please provide a larger integer");
		in = sc.nextInt();


		}	//else if ending brackets	
       
	    else if (in > ran) { // else if higher starting brackets
        System.out.println ("please provide a smaller integer");
		in = sc.nextInt();

		} // else if higher ending brackets

		} //while statement ending brackets
		
	} // main string args ending brackets
}
