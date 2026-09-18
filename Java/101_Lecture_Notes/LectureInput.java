/*
    Lecture note example - Input!!
*/
//need to make code that calculates the tip and ads it to the grand total

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner Input = new Scanner(System.in);
    
    double price1 = 45.25;    
    double price2 = 35.55;
    double price3 = 20.95;
    double price4 = 5.59;


    System.out.println("welcome to Ruben's eating place");
    
    System.out.print("Gf Pizza ");
    System.out.print(price1);
    System.out.println(" $");
    

    System.out.print ("Gf Pasta ");
    System.out.print (price2); 
    System.out.println (" $");
    
    System.out.print ("Gf mozzarella sticks ");
    System.out.print (price3);
    System.out.println (" $");

    System.out.print ("RootBeer");
    System.out.print (price4);
    System.out.println (" $");

        
    System.out.println("How many orders of Gf pizza");
    
    int numinput = Input.nextInt();  
    System.out.println("");
  

    System.out.println("How many orders of Gf pasta");
    int numinput2 = Input.nextInt();
    System.out.println("");

    System.out.println("How many orders of Mozzarela sticks");
    int numinput3 = Input.nextInt();
    System.out.println(""); 

    System.out.println("how many orders of Root Beer");
    int numinput4 = Input.nextInt();
    System.out.println(""); 
    
    double totalcost = (numinput*45.25) + (numinput2*35.55) + (numinput3*20.95) + (numinput4*5.59);
    System.out.print ("total cost without tip ");
    System.out.print(totalcost);
    System.out.println("$");
   
    System.out.println (" how much would you like to tip");
    double tip = Input.nextDouble();
    
    tip = tip/100 * totalcost;
    System.out.println ("cost plus tip");
    System.out.print (tip + totalcost);
    System.out.print (" $");
	}
}
