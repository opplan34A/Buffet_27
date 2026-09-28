/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
    int otonine = (int) (Math.random() * (9 - 0) + 0 );
    int onetohundred = (int) (Math.random() * (100 - 0) + 0);
    double twotothree = Math.random() * (3.5 - 2.5) + 2.5;
    double fourteenfivhun = Math.random () * 589 - 14  + 14 ;



		System.out.print("here is an integer from 0 - 9 "); 
		System.out.println(otonine);
        
        System.out.print ("here is an integer from 0 - 100 ");
		System.out.println (onetohundred);

        System.out.print ("here is a decimal between 2.5 and 3.5 ");
        System.out.println (twotothree);

        System.out.print ("here is a decimal between 14 and 589 ");
        System.out.println (fourteenfivhun);



	}
}
