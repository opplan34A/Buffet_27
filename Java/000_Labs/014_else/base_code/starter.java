/*
 *	Author:  Ruben Coleman Garcia
 *  Date: 10/2/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
        int ran = (int)(Math.random() * 1000 + 1);

		System.out.println("A random number will be generated"); 
		System.out.println("You will try ONCE to guess which number it is");
		System.out.println("the number will be from 1-1000");
		System.out.println("What do you think the number is?");
        

        
		int inp = sc.nextInt();
        

		if (ran == inp){
            System.out.println ("Congrats you got the number correct");

		}
        if (ran != inp) {
            
			System.out.println("Sorry your guess was incorect the real answer was");
			System.out.println (ran);

		}


	}
}
