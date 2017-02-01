// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Spiral {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int x=Integer.parseInt(JOptionPane.showInputDialog("enter a number of sides"));
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		Tortoise.setSpeed(10);
		
		drawShape(x);
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		//done
	}
public static void drawShape(int numsides){

	for (int b = 0; b < 80; b++) {
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.setPenWidth(b);
		Tortoise.move(4*b);
		Tortoise.turn(360/numsides);
	}
	
}
}


