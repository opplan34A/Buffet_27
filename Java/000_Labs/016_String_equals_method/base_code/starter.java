/*
 *	Author:  Ruben Coleman Garcia
 *  Date: 10/6/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
        Scanner sc = new Scanner(System.in);

       

		System.out.println("Hello and welcome to game");
		System.out.println ("Would you like to be a Wizard, Warrior, or Rogue?");
        
		String Uinput = sc.nextLine();
        
		boolean answer1A = Uinput.equals("Wizard");
        boolean answer1B = Uinput.equals ("wizard");
        
		boolean answer2A = Uinput.equals ("Warrior");
        boolean answer2B = Uinput.equals ("warrior");

        boolean answer3A = Uinput.equals ("Rogue");
        boolean answer3B = Uinput.equals ("rogue");

	    


        if(answer1A){
			System.out.println ("congrats you are a Wizard!");
		}
     
	    else if (answer1B){
			System.out.println ("congrats you are a wizard");
		}
        
		else if (answer2A) {
         System.out.println ("congrats you are a Warrior");
		}


		else if (answer2B) {
          System.out.println ("congrats you are a warrior");
		}

		else if (answer3A) {
		System.out.println ("congrats you are a Rogue");
		}
        
		else if (answer3B) {
			
			System.out.println ("congrats you are a rogue");
		}
		else {
             System.out.println ("sorry but that was not an option ");
			 System.out.println ("please run this code again to retry");
		}

	}
}
