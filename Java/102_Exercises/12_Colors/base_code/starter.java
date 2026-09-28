/*
 *	Author:Ruben Coleman Garcia
 *  Date:9/23/2026
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int R = (int) (Math.random ()*255);

        int G = (int) (Math.random ()*255);
        
        int B = (int) (Math.random ()*255);


        int RR = 255 - R;

        int GG = 255 - G;

        int BB = 255 - B;
        
        int RRR = 255 - R;

        int GGG = 255 - G;

        int BBB = 255 - B;

		getColor(R, G, B);
        getColor (BB, RR, GG);
        getColor (GGG,BBB,RRR);

        
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
