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
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("hello there welcome to game again");
		
		
		System.out.println ("What is your name? ");

		String uname = sc.nextLine();

		System.out.println ("");
		
		System.out.println ("What is your title?");
		System.out.println ("example destroyer of worlds");

        String utitle = sc.nextLine();

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
      System.out.println("");
	  System.out.println("");
	  System.out.println("");
	   int points = 20;  
       
	   System.out.println ("you have twenty skill points to spend in the following abilities");
	   System.out.println ("Strength,Dexterity,Intellience, and Charisma");
       
	   System.out.print ("strength 1-10 ");
	   
	   int inS = sc.nextInt();
	   boolean inSB = inS >= 1 ;  
	   int pointsS = points - inS;
	   if ((inS>=0) && (inS<=10)) {
		
		System.out.println ("b");
		System.out.print ("You have " + pointsS);
		System.out.println (" points left");

		System.out.println ("");
	 
	   System.out.println ("Dexterity 1 - 10 ");
       
	   int inD = sc.nextInt(); 
	   int pointsD = pointsS - inD;

       if ((inD>=0) && (inD<=10)) {
		System.out.println ("");

		System.out.print("you have "+pointsD );
		System.out.println(" points left");

		System.out.println ("");
	   System.out.println ("Intelligence 1 - 10");
	   int inI = sc.nextInt ();
        
	   int pointsI = pointsD - inI;
	   if (pointsI<inI) {
		System.out.println ("please provide a smaller value and rerun the code");
	   }
       else {

	   
	   if ((inI>=0) && (inI<=10)) {
		System.out.println ("");
		System.out.print ("you have " + pointsI);
		System.out.println (" points left");

	   }
	   System.out.println("");
	 
	   System.out.println("Charisma 1 - 10");
	  
	   int inC = sc.nextInt ();
       
	   
      
	   int pointsC = pointsI - inC;
    if ((pointsC<inC)&&(pointsC<0)) {
		System.out.println ("please provide a smaller value ");
	   } 
	   else {

	   if ((inC>=0) && (inC<=10)) {

		System.out.println ("");

		System.out.println ("you have "+pointsC);
		System.out.println (" points left");
	   }
	   System.out.print ("you are "+uname);
	   System.out.println (", the "+utitle);
	   System.out.print ("You are a "+ Uinput);
	   System.out.println (" with the following stats!!!");
	 
	   System.out.println ("strength - " + inS);
	   System.out.println ("dexterity - " + inD);
	   System.out.println ("intelligence - " + inI);
	   System.out.println ("charisma - " + inC);
	   
	   System.out.println ("good luck on your activities " + uname);


	   }
	   }
	   }
	   else {
		System.out.println ("Sorry but that was not an option please run this code again");
	   }
	   }
	   else {
	   
	   System.out.println ("please input a different value");
	   double inS = sc.nextDouble(); 
	   double pointsS = points - inS; 

	if ((inS>=0) && (inS<=10)) {
		
		System.out.println ("b");
		System.out.print ("You have " + pointsS);
		System.out.println (" points left");

		System.out.println ("");
	 

	   }
     

	}
}
}
