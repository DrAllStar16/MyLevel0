
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("DO YOU LIKE BANANA'S");
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (banana.equals("No")) {
			JOptionPane.showMessageDialog(null, "YOUR INSANE");
		}
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		else if (banana.equals("Yes")) {
			String hobby = JOptionPane.showInputDialog("WHAT IS YOUR FAV HOBBY");
			JOptionPane.showMessageDialog(null, hobby+ "is way better than BANANA'S");
		}
		else {
			JOptionPane.showMessageDialog(null,  "ANSWER WITH YES OR NO! ");
		
		}
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”
	}

}
