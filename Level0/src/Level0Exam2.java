

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;


/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class Level0Exam2 {

	public static void main(String[] args) {
		
		String age=JOptionPane.showInputDialog("How old are you?");
		
		
		int yearage = Integer.parseInt(age);
		
		int year= 2017-yearage;
		
		JOptionPane.showMessageDialog(null, "you where born in " +year);

		if (yearage>29) {
			JOptionPane.showMessageDialog(null, "but, you are to old to play this game");
		}
}
}
