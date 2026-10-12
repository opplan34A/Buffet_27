/*
 *	Author:Ruben Coleman Garcia
 *  Date: 10/2/2026
 *	Collaborator(s): 
*/
// to compare strings use .equals()


import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        
		System.out.println ("Welcome to the museum of art and stuff");
        System.out.println ("Which part of the museum would you like to visit");
		
		System.out.println ("part 1. Nuclear Semiotics Symbols");
		System.out.println ("part 2. Food");
		System.out.println ("part 3. Water Containers");
        

		String op1 = "Nuclear Semiotics Symbols";
		String op3 = "Water Containers";
	    String op2 = "Food";
        
		String input = in.nextLine(); 

		if (input.equals(op1)){
             
			System.out.println ("what specifically do you want to see"); 
			System.out.println ("option 1. menacing earthworks");
			System.out.println ("option 2. painting");

	        String SemOneA = in.nextLine();
            

        if (SemOneA.equals ("menacing earthworks")){
            
			System.out.println ("menacing earthworks");
             
            System.out.println ("     ^");
			System.out.println ("    / |__/");
			System.out.println ("|__/  |");

			System.out.println ("Side note ");
			System.out.println ("i encourage you to look up the nuclear semiotics program conceptual designs");
			System.out.println ("I cannot do them justice here");
	        


		}
        if (SemOneA.equals("painting")) {
			System.out.println ("The painting");
			System.out.println ("_______");
		    System.out.println ("|This |");
            System.out.println ("| Is  |");
			System.out.println ("| Not |");
			System.out.println ("| A   |");
			System.out.println ("|Place|");
			System.out.println ("|of   |");
			System.out.println ("|Honor|");
            System.out.println ("|_____|");
			System.out.println ("|*****|");
			
	


		}

            


		}


        else if (input.equals("Food")){
                System.out.println ("what do you want to see");
				System.out.println ("option 1. triangle quesadilla");
				System.out.println ("option 2. sandwitch");

				String food2A = in.nextLine();

				if (food2A.equals ("triangle quesadilla")){
             System.out.println ("quesadilla");

		    System.out.println ("      ^");
		    System.out.println ("     /|");
			System.out.println ("    / |");
            System.out.println ("   /  |");
			System.out.println ("  /   |");
			System.out.println (" /____|");




				}
            if (food2A.equals ("sandwitch")) {
              
			  System.out.println ("sandwitch");
			  
			  System.out.println ("_______");
              System.out.println ("|______|");
			  System.out.println ("|______|");            
 

			}


		}		


		else if (input.equals("Water Containers")) {
          System.out.println ("What water containers do you want to see");
		  System.out.println ("option 1. glass of water");
		  System.out.println ("option 2. bottle of water");

		  String water3A = in.nextLine();

		  if (water3A.equals ("glass of water")) {
            
			System.out.println ("a glass of water");
			System.out.println ("|_____|");
			System.out.println ("|     |");
			System.out.println ("|     |");
            System.out.println ("|_____|");
			System.out.println ("|_____|");
		

		  } 
		
		 if (water3A.equals ("bottle of water")) {

			System.out.println ("  ______");
            System.out.println ("  |____|");
			System.out.println ("__|    |__");
            System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|         |");
			System.out.println ("|_________|");

		


		 }


		}
		
		
		else {
			System.out.println ("thank you for visiting but that was not an option");
		}



	}
}