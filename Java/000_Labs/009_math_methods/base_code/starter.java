/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        int math1 = Math.max (13 - 6 * 11, 30 % 7 * (-2));
		System.out.print("Maximum = ");
		System.out.println(math1); 
        
        double math2 = Math.sqrt (3 * 8 + 31 % 7);
		System.out.print ("square root = ");
        System.out.println (math2);

		double math3 = Math.pow (37 / 3, 35 % 21);
		System.out.print ("power = ");
		System.out.println (math3);

        double math5A = Math.pow (2,14%3);
        double math6A = Math.sqrt (2*6);

		double math4A = Math.max(math5A , math6A );
		System.out.print ("Maximum = ");
        System.out.print (math4A);
	}
}
