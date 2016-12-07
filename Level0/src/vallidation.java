import java.util.Random;


import javax.swing.JOptionPane;


public class vallidation {
	public static void main(String[] args) {


		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		// 2. On paper, write all the numbers that get printed when you run this class
		//System.out.println(randomNumber);


		 for (int i = 0; i < 100; i++) {
			
		// 3. Use the randomNumber to give the user a random compliment.
			 int randomNumber = new Random().nextInt(5);
	if (randomNumber ==0) {
		JOptionPane.showMessageDialog(null, "You look amazing");
	}
	if (randomNumber==1) {
		JOptionPane.showMessageDialog(null, "Nice shoes");
	}
	if (randomNumber==2) {
		JOptionPane.showMessageDialog(null, "I like that shirt");
	}
	if (randomNumber==3) {
		JOptionPane.showMessageDialog(null, "Pizza is great");
	}
	if (randomNumber==4) {
		JOptionPane.showMessageDialog(null, "Your ugly");
	}
		 }
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}




