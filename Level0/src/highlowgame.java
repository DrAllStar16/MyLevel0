 import java.util.Random;

import javax.swing.JOptionPane;


// Copyright Wintriss Technical Schools 2013
public class highlowgame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		 //JOptionPane.showMessageDialog(null, ""+random);
		// 11. do the following 10 times
		int pooped=0;
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String poop=JOptionPane.showInputDialog("1 through 100");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
pooped=Integer.parseInt(poop);
			// 5. if the guess is correct
				// 6. win
			if (random==pooped) {
				JOptionPane.showMessageDialog(null, "you win your the champion");
				break;
			}
			// 7. if the guess is high
				// 8. tell the;m it's too high
			if (pooped>random) {
				JOptionPane.showMessageDialog(null, "Too high you fail");
			}
			// 9. if the guess is low
				// 10. tell them it's too low
			if (pooped<random) {
				JOptionPane.showMessageDialog(null, "Too low you fail");
			}

		}
		// 12. tell them they lose
		if (pooped!=random) {
			
		
		JOptionPane.showMessageDialog(null, "You lose out of guess's");
		JOptionPane.showMessageDialog(null, " The answer is " + random);
		JOptionPane.showMessageDialog(null, "You are a huge failier");


	}
}
}



